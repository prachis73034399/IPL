<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="/ipl2/src/main/resources/style.css">
		<style>
			p.ex1
				{
   			 		margin-top: 2cm;
				}
			.file 
				{
 					visibility: hidden;
 					position: absolute;
				}
			
			function clearField() 
			{
				document.chatform.reset();
			}
			
			.test
			{
				height:50px;
	  			  width:200px;
	  			  background-color:#4169E1;
	  			  color: white;
    		}
			body 
			{
    			background-image: url("http://www.hdwallpapersact.com/wp-content/gallery/cricket-stadium/cricket-stadium-1920x1080-image.jpg");
    			background-repeat: no-repeat;
    			background-size:cover;
			}
			
		</style>
	</head>
	<body>
		<nav class="navbar navbar-default navbar-fixed-top">
  			<div class="container-fluid">
    			<div class="navbar-header">
     				 <a class="navbar-brand" href="#"><font style="color:blue;">IPL</font></a>
   				</div>
  			</div>
		</nav>
		<h1></h1>
		<h1></h1>
		<div class="container">
		<h2><h2>
 		<h2></h2>
		<p class="ex1"><button type="button" class="test" data-toggle="modal" data-target="#myModal"><b><h4>Create New Team</h4></b></button></p>
		<!-- Modal -->￼
		<div class="modal fade" id="myModal" role="dialog">
    		<div class="modal-dialog  modal-sm">
					<!-- Modal content-->
					<div class="modal-content">
					  <div class="modal-header">
					    	<button type="button" class="close" data-dismiss="modal">&times;</button>
					   		<h4 class="modal-title"><b>Create New Team</b></h4>
        			</div>
       				 <div class="modal-body">
        				<form id="main" name="teams" action="save.html" method="post" enctype="multipart/form-data"  >
          					<table>
								<tr>
									<td>
										<table class="silver">
										<tr>
											<td><h5>Team Name</h5></td>
										</tr>
										<tr>
											<td>
												<input type="text" name="teamName" placeholder="Team name">
												<!-- <form:errors path="area" cssClass="errors"/> -->
											</td>
										</tr>
										<tr>
											<td><h5>Captain Name</h5></td></tr>
										<tr>
											<td>
												<input type="text" name="captainName" placeholder="Captain name">
												<!-- <form:errors path="area" cssClass="errors"/> -->
											</td>
										</tr>
										<tr>
											<!-- <td>Image</td> -->
											<td>
												<label class="control-label">Select Image</label>
												<input id="input-4" name="file" type="file" multiple class="file-loading">
											</td>
										</tr>
			 							<tr>
											<td align="left" valign="bottom">
												<button type="submit" name="signup" onClick="myFunction()">Save</button>
								 			</td>
										</tr>
									</table>
								</td>
							</table>
						</form>
					 </div>	
				</div>
       		</div>
    	</div>
     </td>
</body>


</html>