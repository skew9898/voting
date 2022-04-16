package in.co.online.vote.controller;

public interface OVSView {
	
	public String APP_CONTEXT = "/OnlineVotingSystem";

	public String LAYOUT_VIEW = "/BaseLayout.jsp";
	public String PAGE_FOLDER = "/jsp";

	public String JAVA_DOC_VIEW = APP_CONTEXT + "/doc/index.html";

	public String ERROR_VIEW = PAGE_FOLDER + "/Error.jsp";

	
	public String USER_REGISTRATION_VIEW = PAGE_FOLDER + "/UserRegistrationView.jsp";
	
	
	public String PARTY_VIEW = PAGE_FOLDER + "/PartiesView.jsp";
	
	public String OTP_VIEW = PAGE_FOLDER + "/OTPView.jsp";
	
	public String VOTE_VIEW = PAGE_FOLDER + "/VoteView.jsp";
	
	public String VOTE_LIST_VIEW = PAGE_FOLDER + "/VoteListView.jsp";
	public String LOGIN_VIEW = PAGE_FOLDER + "/LoginView.jsp";
	public String WELCOME_VIEW = PAGE_FOLDER + "/WelcomeView.jsp";
	public String CHANGE_PASSWORD_VIEW = PAGE_FOLDER + "/ChangePasswordView.jsp";
	public String MY_PROFILE_VIEW = PAGE_FOLDER + "/MyProfileView.jsp";
	public String FORGET_PASSWORD_VIEW = PAGE_FOLDER + "/ForgetPasswordView.jsp";

	public String USER_LOGIN_VIEW = PAGE_FOLDER + "/UserLoginView.jsp";
	

	public String ERROR_CTL = "/ctl/ErrorCtl";

	public String PARTY_CTL = APP_CONTEXT + "/ctl/PartiesCtl";
	
	public String VOTE_CTL = APP_CONTEXT + "/ctl/VoteCtl";
	
	public String VOTE_LIST_CTL = APP_CONTEXT + "/ctl/VoteListCtl";
	
	public String OTP_CTL = APP_CONTEXT + "/ctl/OTPCtl";
	
	public String USER_REGISTRATION_CTL = APP_CONTEXT + "/UserRegistrationCtl";
	public String LOGIN_CTL = APP_CONTEXT + "/LoginCtl";
	public String WELCOME_CTL = APP_CONTEXT + "/WelcomeCtl";
	public String LOGOUT_CTL = APP_CONTEXT + "/LoginCtl";
	public String GET_MARKSHEET_CTL = APP_CONTEXT + "/ctl/GetMarksheetCtl";
	public String CHANGE_PASSWORD_CTL = APP_CONTEXT + "/ctl/ChangePasswordCtl";
	public String MY_PROFILE_CTL = APP_CONTEXT + "/ctl/MyProfileCtl";
	public String FORGET_PASSWORD_CTL = APP_CONTEXT + "/ForgetPasswordCtl";
	public String MARKSHEET_MERIT_LIST_CTL = APP_CONTEXT + "/ctl/MarksheetMeritListCtl";

	public String USER_LOGIN_CTL = APP_CONTEXT + "/UserLoginCtl";

}
