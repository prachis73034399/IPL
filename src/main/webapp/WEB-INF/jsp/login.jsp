<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<!-- <meta charset="utf-8"> -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="/ipl2/src/main/resources/style.css">
		<style>
			p.ex1
			{
   			 	margin-top: 2cm;
			}
			.file 
			{
				 visibility: hidden;
				 position: absolute;
			}
			function clearField() 
			{
				document.chatform.reset();
			}
		</style>
	</head>
	<body>
		<nav class="navbar navbar-default navbar-fixed-top">
  			<div class="container-fluid">
   				 <div class="navbar-header">
     				 <a class="navbar-brand" href="#"><font style="color:blue;">IPL</font></a>
    			</div>
  			</div>
		</nav> 
		<p class="ex1">
			<h1> Login Form is here..</h1></p>
			<form:form modelAttribute="userLogin" action="loging.html" method="post">
					<table>
						<tr>
							<td>
								<table class="silver">
									<tr>
										<td><h5>User Name</h5></td>
										<td>
											<form:input path="userName" size="20" maxlength="50" />
											<%-- <form:errors path="name" cssClass="errors"/> --%>
										</td>
									</tr>
									<tr>
										<td><h5>Password</h5></td>
										<td>
											<form:input path="password" size="8" maxlength="8" type="password" />
										</td>
									</tr>
									<tr>
										<td align="right" valign="bottom">
											<button type="submit">Login</button>
								 		</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
			</form:form>
	</body>
</html>