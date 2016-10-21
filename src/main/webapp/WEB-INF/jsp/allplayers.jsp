<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
			p.ex1
				{
   			 			 background-repeat: no-repeat;
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
	<div class="row">
	<%-- <h4>Palyers of ${plr.teamName}</h4>  --%>
	<h1>Players of ${plr.teamName}</h1> 
  			<div class="col-sm-4">
  			<c:forEach items="${players}" var="plr">
  			 
					<div class="card" style="display:inline-block;">
						<a href="playerdetails.html?playerName=${plr.playerName}"><img class="card-img-top" src="http://localhost:2586/prachi/${plr.img}" alt="Card image cap"/>
		 					<div class="card-block">
   								<font color="#000000"><h1>${plr.playerName}</h1></font>
   							</div>
		 			</div>
		 			
		 			 
			</c:forEach>
				
			</div>
	</div>
</body>
</html>