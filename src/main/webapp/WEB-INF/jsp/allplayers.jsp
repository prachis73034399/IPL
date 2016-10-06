<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row">
	
  			<div class="col-sm-4">
				<c:forEach items="${players}" var="plr">
					<div class="card">
					<%-- <h4>${plr.playerName}</h4>  --%>
					
 						
 						<img class="card-img-top" src="http://localhost:3698/prachi/players/${plr.img}" alt="Card image cap" />
		 					 <div class="card-block">
		 					<a href="playerdetails.html?playerName=${plr.playerName}" enctype="multipart/form-data">${plr.playerName}</a>
   								
		 			
		 				<!-- </a> -->
					</div>
				</c:forEach>
			</div>
		</div>
</body>
</html>