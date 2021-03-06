<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1">
	<title>Login page</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<div class="container">
		<#include "/header.html" parse=true encoding="Shift_JIS">
		
		<div class="jumbotron col-md-12" id="loginDiv">
			<!--<h1><small>Login</small></h1> -->
			<span id="txtHint"></span> 	
			<form action="http://localhost:8080/Ecommerce/rest/login" class="col-md-6 col-md-offset-1" id="loginForm" method="POST" onsubmit="return validate();">
				<legend>Login here</legend>
				<fieldset class="form-group">
	    				<label for="exampleInputEmail">Email Address</label>
	    				<input type="email" class="form-control" id="exampleInputEmail" name="loginInputEmail" placeholder="Enter Email">
					<p id="email" style="color:red; font-size:12px;" hidden="hidden">Please enter email id!</p>
	 			</fieldset>
				<fieldset class="form-group">
	    				<label for="exampleInputPassword">Password</label>
	    				<input type="password" class="form-control" id="exampleInputPassword" name="loginInputPassword" placeholder="Password">
					<p id="password" style="color:red; font-size:12px;" hidden="hidden">Please enter password</p>
	  			</fieldset>
	  			<lable>
	  				<input type="checkbox">Remember me
	  			</lable><br/><br/>
			 	 <button type="submit" class="btn btn-primary" style="margin:0px 5px" id="signIn">Log in</button>
				 <button type="reset" class="btn btn-primary" style="margin:0px 5px" id="signUp">Reset</button><br/><br/>
				 <span><small>If your are a new user,</small> <a href="http://localhost:8080/Ecommerce/rest/registerHere" method="GET">register here</a></span>
				</form>
			</div>
			<div class="clearfix"></div>
			
			<#include "/footer.html" parse=true encoding="Shift_JIS">
	</div>
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="../js/LoginValidation.js"></script>
	<script>
		$(function(){
			$("#header").load("header.html");
			$("#footer").load("footer.html");
		});
	</script>

</body>
</html>
