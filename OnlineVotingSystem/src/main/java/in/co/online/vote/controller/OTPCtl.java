package in.co.online.vote.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.online.vote.bean.BaseBean;
import in.co.online.vote.bean.VoteBean;
import in.co.online.vote.exception.ApplicationException;
import in.co.online.vote.exception.DuplicateRecordException;
import in.co.online.vote.model.VotePartiesModel;
import in.co.online.vote.util.DataUtility;
import in.co.online.vote.util.DataValidator;
import in.co.online.vote.util.PropertyReader;
import in.co.online.vote.util.ServletUtility;

/**
 * Servlet implementation class OTPCtl
 */
@WebServlet(name="OTPCtl",urlPatterns={"/ctl/OTPCtl"})
public class OTPCtl extends BaseCtl {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Logger log=Logger.getLogger(OTPCtl.class);
       
	@Override
    protected boolean validate(HttpServletRequest request) {
		log.debug("OTPCtl validate method start");
        boolean pass = true;

        if (DataValidator.isNull(request.getParameter("enterOTP"))) {
        	ServletUtility.setSuccessMessage("Your OTP Is "+request.getParameter("OTP"), request);
            request.setAttribute("enterOTP",
                    PropertyReader.getValue("error.require", "OTP"));
            pass = false;
        }
        

        log.debug("OTPCtl validate method end");
        return pass;
    }
	
	
	@Override
	protected BaseBean populateBean(HttpServletRequest request) {
		log.debug("OTPCtl populateBean method start");
		VoteBean bean=new VoteBean();
		bean.setEnterOTP(DataUtility.getLong(request.getParameter("enterOTP")));
		bean.setOTP(DataUtility.getLong(request.getParameter("OTP")));
		populateDTO(bean, request);
		log.debug("OTPCtl populateBean method end");
		return bean;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("OTPCtl doGet method start"); 
		String op = DataUtility.getString(request.getParameter("operation"));
			
		   VotePartiesModel model = new VotePartiesModel();
			VoteBean bean=new VoteBean();
		   
			long OTP=model.getRandom();
			
			bean.setOTP(OTP);
			ServletUtility.setBean(bean, request);
			ServletUtility.setSuccessMessage("Your OTP is "+OTP, request);
			ServletUtility.forward(getView(), request, response);
			log.debug("OTPCtl doGet method end");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.debug("OTPCtl doPost method start");
		String op=DataUtility.getString(request.getParameter("operation"));

		
		
		
		
		if(OP_SUBMIT.equalsIgnoreCase(op)){
			
			VoteBean bean=(VoteBean)populateBean(request);
			
			if(bean.getOTP()==bean.getEnterOTP()) {
				
				response.sendRedirect(OVSView.VOTE_CTL);
					
			}else {
				ServletUtility.setSuccessMessage("Your OTP is "+bean.getOTP(), request);
				ServletUtility.setBean(bean, request);
				ServletUtility.setErrorMessage("Your OTP Is Incorrect Please Re-Enter", request);
				ServletUtility.forward(getView(), request, response);
			}
				
		}
		
		 log.debug("OTPCtl doPost method end");
	}

	@Override
	protected String getView() {
		// TODO Auto-generated method stub
		return OVSView.OTP_VIEW;
	}

}
