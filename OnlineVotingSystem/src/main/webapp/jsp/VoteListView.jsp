<%@page import="in.co.online.vote.controller.OVSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<%@ include file="Header.jsp"%>
<main class="login-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">
					Resutl
						
					</div>

					<div class="card-body">

						<form action="<%=OVSView.VOTE_LIST_CTL%>" method="post">
						
						
							<%  int l=(int) request.getAttribute("list");
								int l2=(int) request.getAttribute("list2");
								int l3=(int) request.getAttribute("list3");
							%>
							

							<div class="form-group row">
								<label for="email_address" 
									class="col-md-4 col-form-label text-md-right">Democrats<font color="red">*</font></label>
								<div class="col-md-6">
									<img alt="" src="/OnlineVotingSystem/img/democrats.png" style="height: 40px">&ensp;&ensp;&ensp;&ensp;&ensp;
									<%=l%>
								</div>
							</div>
							
							<div class="form-group row">
								<label for="email_address" 
									class="col-md-4 col-form-label text-md-right">Republicans<font color="red">*</font></label>
								<div class="col-md-6">
									<img alt="" src="/OnlineVotingSystem/img/2000px-Republicanlogo.svg.png" style="height: 40px">&ensp;&ensp;&ensp;&ensp;
									<%=l2%>
								</div>
							</div>
							
							<div class="form-group row">
								<label for="email_address" 
									class="col-md-4 col-form-label text-md-right">Independents<font color="red">*</font></label>
								<div class="col-md-6">
									<img alt="" src="/OnlineVotingSystem/img/IPNY_Logo_3423432.png" style="height: 40px">&ensp;&ensp;&ensp;&ensp;&ensp;
										<%=l3%>
								</div>
							</div>
							
							
							

							
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
	</main>
	<div style="margin-top: 168px">
		<%@ include file="Footer.jsp"%>
	</div>
</body>
</html>