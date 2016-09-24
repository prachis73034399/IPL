<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>
	<h1> Login Form is here..</h1>
	<form:form modelAttribute="userLogin" action="hieee.html" method="post">
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
								<form:input path="password" size="8" maxlength="8" />
								<%-- <form:errors path="area" cssClass="errors"/> --%>
							</td>
						</tr>
					
				<tr>
					<td align="right" valign="bottom">
						<button type="submit">Login</button>
					 </td>
				</tr>
						<%-- <tr>
							<td><h5>Last Name</h5></td>
							<td>
								<form:input path="lastName" size="12" maxlength="12" />
								<form:errors path="populationLastUpdated" cssClass="errors"/>
							</td>
						</tr> --%>
					
			</table>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>