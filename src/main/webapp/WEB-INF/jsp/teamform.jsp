<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="team" action="signup.html" method="post">
			<table>
				<tr>
					<td align="right" valign="bottom">
						<button type="submit" name="signup">Save</button>
					 </td>
				</tr>
				<tr>
					<td>
						<table class="silver">
						
						<tr>
							<td><h5>Team Name</h5></td>
							<td>
								<form:input path="teamName" size="20" maxlength="50" />
								<%-- <form:errors path="name" cssClass="errors"/> --%>
							</td>
						</tr>
						<tr>
							<td><h5>Captain Name</h5></td>
							<td>
								<form:input path="captainName" size="8" maxlength="8" />
								<%-- <form:errors path="area" cssClass="errors"/> --%>
							</td>
						</tr>
						
					
			</table>
		</td>
	</tr>
</table>
</form:form>

</body>
</html>