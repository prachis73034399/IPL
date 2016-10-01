<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<style>
p.ex1 {
    margin-top: 2cm;
}
.file {
  visibility: hidden;
  position: absolute;
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


  <p class="ex1"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Create New Team</button></p>
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
          <form name="teams" action="save.html" method="post" enctype="multipart/form-data">
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
						<script>
						$(document).on('ready', function()
						{
						    $("#input-4").fileinput({showCaption: false});
						});
						</script></td>
						</tr>
 

						
						<tr>
					<td align="left" valign="bottom">
						<button type="submit" name="signup">Save</button>
					 </td>
				</tr>
						
					
			</table>
		</td>
	</tr>
</table>
          </form>
        </div>
        
      </div>
      
    </div>
  </div>
</div>
	<form modelAttribute="userLogin" action="hieee.html" method="post">	
	<button type="submit">ghdsfj</button>
	</form>
	<img src="/home/bridgeit/Desktop/ipl2/src/main/resources/images/DD.jpg" width="50" height="50">		 
</body>
<style>$(document).on('click', '.browse', function(){
  var file = $(this).parent().parent().parent().find('.file');
  file.trigger('click');
});
$(document).on('change', '.file', function(){
  $(this).parent().find('.form-control').val($(this).val().replace(/C:\\Desktop\\/i, ''));
});</style>
</html>