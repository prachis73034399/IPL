<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> Country Details</h3>
			<table class="silver" width="180">
				<c:forEach items="${players}" var="plr">
					<tr>
						<td><font color="red">Id</font></td>
						<td>${plr.id}</td><br>
					</tr>	
					<tr>
						<td><font color="red">Name</font></td>
						<td>${plr.playerName}</td>
					</tr>
				<%-- 	<tr>
						<td><font color="red">Area</font></td>
						<td>${country.area}</td>
					</tr>
					<tr>
						<td><font color="red">Population</font></td>
						<td>${country.population}</td>
					</tr>
					<tr>
						<td><font color="red">Updated on</font></td>
						<td>${country.populationLastUpdated}</td>
					</tr>
					<tr>	
						<td><font color="red">Currency</font></td>
						<td>${country.currency}</td>
					</tr> --%>
					<tr>
						<%-- <button>
							<a href="countryDetail.html?id=${country.id}">DELETE</a>
							
						</button> --%>
					</tr>
				</c:forEach>
			</table>
</body>
</html>