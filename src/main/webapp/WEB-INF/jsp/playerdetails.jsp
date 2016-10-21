<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
p.ex1 {
    margin-top: 50px;
}
.file {
  visibility: hidden;
  position: absolute;
}
body 
{
	/* background-image: url("http://www.hdwallpapersact.com/wp-content/gallery/cricket-stadium/cricket-stadium-1920x1080-image.jpg"); */
	background-repeat: no-repeat;
	background-size:cover;
}

</style>
</head>
<body>

<h3> Player Details</h3>
			<table  width="180">
				<c:forEach items="${players}" var="plr">
					<tr>
						<td><img class="card-img-top" src="http://localhost:2586/prachi/${plr.img}" alt="Card image cap" /></td>
					</tr>
					<tr>
						<td><font color="#000000"><b><h1>Name</h1></b></font></td>
						<td><font color="#000000"><b><h1>${plr.playerName}</h1></b></font></td>
					</tr>
					<tr>
						<td><font color="#000000"><b><h1>Age</h1></b></font></td>
						<td><font color="#000000"><b><h1>${plr.age}</h1></b></font></td>
					</tr>
					<tr>
						<td><font color="#000000"><b><h1>Nationality</h1></b></font></td>
						<td><font color="#000000"><b><h1>${plr.nationality}</h1></b></font></td>
					</tr>
					<tr>
						<td><font color="#000000"><b><h1>Batting Style</b></font></td>
						<td><font color="#000000"><b><h1>${plr.battingstyle}</h1></b></font></td>
					</tr>
					<tr>	
						<td><font color="#000000"><b><h1>Bowling Style</h1></b></font></td>
						<td><font color="#000000"><b><h1>${plr.bowlingstyle}</h1></b></font></td>
					</tr>
					
				</c:forEach>
			</table>
</body>
</html>