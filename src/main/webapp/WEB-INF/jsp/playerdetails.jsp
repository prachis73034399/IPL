<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> Player Details</h3>
			<table  width="180">
				<c:forEach items="${players}" var="plr">
					<tr>
						<td><img class="card-img-top" src="http://localhost:3698/prachi/players/${plr.img}" alt="Card image cap" /></td>
					</tr>
					<tr>
						<td><font color="red">Name</font></td>
						<td>${plr.playerName}</td>
					</tr>
					<tr>
						<td><font color="red">Age</font></td>
						<td>${plr.age}</td>
					</tr>
					<tr>
						<td><font color="red">Nationality</font></td>
						<td>${plr.nationality}</td>
					</tr>
					<tr>
						<td><font color="red">Batting Style</font></td>
						<td>${plr.battingstyle}</td>
					</tr>
					<tr>	
						<td><font color="red">Bowling Style</font></td>
						<td>${plr.bowlingstyle}</td>
					</tr>
					
				</c:forEach>
			</table>
</body>
</html>