<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="teams" action="teamformed" method="post">
<button onclick="window.location='teamform.html'">Create New Team</button>
hello
<table class="silver" width="180">
						<c:forEach items="${teams}" var="team">
							<tr>
								
								<td>
									<li>
										
									<a href="playersinfo.html?id=${team.id}">${team.teamName}</a>
									</li>
								</td>
								
							</tr>
						</c:forEach>
					</table>
</form:form>					 
</body>
</html>