<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
	 	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	 	<link href="/ipl2/src/main/resources/style.css">
		<style>
			p.ex1
			{
   			 	background-repeat: no-repeat;
			}
			body 
			{
				background-image: url("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRUEor8dY8LEXBPuOyI6r3oSqgv5FjcH_1lDU10HNmuYqNtmG0t");  
				background-repeat: no-repeat;
				background-size:cover;
			}

		</style>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
	
				<h1></h1> 
  				<div class="col-sm-8">
  					<c:forEach items="${players}" var="plr">
  						<c:set var="plrdd" value="${plr.teamName}"/>
							<div class="card" style="display:inline-block;">
								<a href="playerdetails.html?playerName=${plr.playerName}"><img class="card-img-top" src="http://localhost:2586/prachi/${plr.img}" alt="Card image cap"/></a>
		 						<div class="card-block">
   									<font color="#000000"><h3>${plr.playerName}</h3></font>
   								</div>
		 					</div>
		 			 </c:forEach>
			
				</div>
				<div class="col-sm-4">
					<form  id="myForm" name="teams" action="saveplayer.html" method="post" enctype="multipart/form-data" style="width: 500px">
						<h2> Add new Player of ${plrdd}</h2>
	          			<table>
							<tr>
								<td>
									<table class="silver">
									<tr>
										<td><h4><b>Player Name</b></h4></td>
									</tr>
									<tr>
										<td>
											<input type="text" name="playerName" placeholder="Player name">
										</td>
									</tr>
								
									<tr>
										<td><h4><b>Team Name</b></h4></td>
									</tr>
								
									<tr>
										<td>
											<input type="text" name="teamName" value="${plrdd}">
										</td>
									</tr>
								 	<break>
							
									<tr>
										<td>
											<h4><b>Age</b></h4>
										</td>
									</tr>
									<tr>
										<td>
											<input type="text" name="age" placeholder="Age">
										</td>
									</tr>
									<tr>
										<td>
											<h4><b>Nationality</b></h4>
										</td>
									</tr>
									<tr>
										<td>
											<input type="text" name="nationality" placeholder="Nationality">
										</td>
									</tr>
									<tr>
										<td>
											<h4><b>Batting Style</b></h4>
										</td>
									</tr>
									<tr>
										<td>
											<input type="text" name="battingstyle" placeholder="Batting Style">
										</td>
									</tr>
									<tr>
										<td>
											<h4><b>Bowling style</b></h4>
										</td>
									</tr>
									<tr>
										<td>
											<input type="text" name="bowlingstyle" placeholder="Bowling style">
										</td>
									</tr>
									<tr>
										<td>
											<h4><b>Select Image</b></h4>
											<h4></h4>
											<input id="input-4" name="file" type="file" multiple class="file-loading">
										</td>
									</tr>
			 						<tr>
										<td align="left" valign="bottom">
											<button type="submit" class="test" name="signup">Save</button>
								 		</td>
								 		<td align="left" valign="bottom">
										</td>
									</tr>
								</table>
							</form>
				 		</div>
					</div>	
				</div>
		</body>
</html>