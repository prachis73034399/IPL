<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			.label
			 {
				  text-align:middle;
				  padding-right:20px;
				  display:inline-block;
				  min-width:150px;
			}
</style>
</head>
<body>
<h1>Player form for ${plrr} team </h1>

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
										<!-- <form:errors path="area" cssClass="errors"/> -->
									</td>
								</tr>
								<tr>
									<td><h5>Team Name</h5></td>
								</tr>
								<tr>
									<td>
									<input type="text" name="teamName" value="${plrr}">
										<%-- <h5>${plrr}</h5> --%>
									
										
										<!-- <input type="text" name="teamName" placeholder="Team name"> -->
										<!-- <form:errors path="area" cssClass="errors"/> -->
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
										<!-- <form:errors path="area" cssClass="errors"/> -->
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
										<!-- <form:errors path="area" cssClass="errors"/> -->
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
										<!-- <form:errors path="area" cssClass="errors"/> -->
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
										<!-- <form:errors path="area" cssClass="errors"/> -->
									</td>
								</tr>
								<tr>
									<!-- <td>Image</td> -->
									<td>
										<h5>Select Image</h5>
										<!-- <label class="control-label">Select Image</label> -->
										<h4></h4>
										<input id="input-4" name="file" type="file" multiple class="file-loading">
									</td>
								</tr>
		 						<tr>
									<td align="left" valign="bottom">
										<button type="submit"  name="signup">Save</button>
							 		</td>
							 		<td align="left" valign="bottom">
										<!-- <button type="submit"  name="signup">preview</button> -->
										<div class="lable" style="width:80px;height:50px;border:1px solid #fff;background-color: #ffffff; align: middle;">
										<a href="showplayers.html?teamName=${plrr}" enctype="multipart/form-data"><font color="000000"><h4><b>Preview</b></h4></font></a>
							 			</div>
							 		</td>
								</tr>
							
						</table>
					</form>
					
				

</body>
</html>