<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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
p.ex1 {
    margin-top: 50px;
}
.file {
  visibility: hidden;
  position: absolute;
}

</style>
</head>
<body>

		<div>
  			<div class="col-md-4">
				<c:forEach items="${players}" var="plr">
					<div class="card" style="display:inline-block;">
						<a href="playerdetails.html?playerName=${plr.playerName}"><img class="card-img-top" src="http://localhost:3698/prachi/players/${plr.img}" alt="Card image cap"/>
		 					<div class="card-block">
   								<h4>${plr.playerName}</h4> 
   				
		 					 </div>
		 					   
					</div>
				</c:forEach>
			</div>
		</div>                 
			
</body>
</html>