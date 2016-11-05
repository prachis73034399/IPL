<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>
			<h3>SignUp</h3>
		</title>
	</head>
	<body>
		<form:form modelAttribute="userer" action="signing.html" method="post">
			<table>
				<tr>
					<td align="right" valign="bottom">
						<button type="submit">Submit</button>
					 </td>
				</tr>
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
								<td><h5>First Name</h5></td>
								<td>
									<form:input path="firstName" size="10" maxlength="10" />
									<%-- <form:errors path="population" cssClass="errors"/> --%>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>
