<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    margin-top: 2cm;
}
.file {
  visibility: hidden;
  position: absolute;
}

body 
			{
    			background-image: url("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRUEor8dY8LEXBPuOyI6r3oSqgv5FjcH_1lDU10HNmuYqNtmG0t");
    			background-repeat: no-repeat;
    			background-size:cover;
			}
</style>
</head>
	</head>
	<body>
<div class="container">
 
		<div>
  			<div class="col-md-12">
				<c:forEach items="${teamed}" var="team">
					<div class="card" style="display:inline-block;">
						<a href="teamformed.html?teamName=${team.teamName}" > <img class="card-img-top" src="http://localhost:2586/prachi/${team.img}" alt="Card image cap" />
		 					<div class="card-block">
   								<h4><font color="000000"><h4><b>${team.teamName}</b></h4></font></h4>
   								<div class="card-action">
   									<%-- <a href="showplayers.html?teamName=${team.teamName}" enctype="multipart/form-data"><font color="ffffff"><h4><b>Show Players of the Team</b></h4></font></a> --%>
     							 </div> 
   					</div>
		 					   
		 					   
					</div>
				</c:forEach>
				
			</div>
		</div>
		
		
		    
			

	<!--   <div class="modal fade" id="myModal" role="dialog">
	    <div class="modal-dialog  modal-sm">
		Modal content
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title"><b>Create New Player</b></h4>
	        </div>
	        <div class="modal-body">
	        	<form  id="myForm" name="teams" action="saveplayer.html" method="post" enctype="multipart/form-data">
	          		<table>
							<tr>
								<td>
									<table class="silver">
								<tr>
									<td><h5>Player Name</h5></td>
								</tr>
								<tr>
									<td>
										<input type="text" name="playerName" placeholder="Player name">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td><h5>Team Name</h5></td>
								</tr>
								<tr>
									<td>
										<input type="text" name="teamName" placeholder="Team name">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td>
										<h5>Age</h5>
									</td>
								</tr>
								<tr>
									<td>
										<input type="text" name="age" placeholder="Age">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td>
										<h5>Nationality</h5>
									</td>
								</tr>
								<tr>
									<td>
										<input type="text" name="nationality" placeholder="Nationality">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td>
										<h5>Batting Style</h5>
									</td>
								</tr>
								<tr>
									<td>
										<input type="text" name="battingstyle" placeholder="Batting Style">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td>
										<h5>Bowling style</h5>
									</td>
								</tr>
								<tr>
									<td>
										<input type="text" name="bowlingstyle" placeholder="Bowling style">
										<form:errors path="area" cssClass="errors"/>
									</td>
								</tr>
								<tr>
									<td>Image</td>
									<td>
										<label class="control-label">Select Image</label>
										<input id="input-4" name="file" type="file" multiple class="file-loading">
									</td>
								</tr>
		 						<tr>
									<td align="left" valign="bottom">
										<button type="submit"  name="signup">Save</button>
							 		</td>
								</tr>
						</table>
					</td>
				</tr>
			</table>
 </div> -->
		
			<!-- <script>
				 function myFunction()
				{
				    document.getElementById("myForm").reset();
				} 
		   </script> -->
	</body>
</html>