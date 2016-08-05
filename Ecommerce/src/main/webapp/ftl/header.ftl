<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1">
	<title>Registration page</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="<#include "/style.css" parse=true encoding="Shift_JIS">>
</head>
<body>
	<div class="container">
		<header id="headerTag">
			<div>
			  	<img id="logo" src="${logo.png}">
				<div style="clear:both"></div>
		     </div>
		</header>
		<div id="divTwo">
				<span class="glyphicon glyphicon-search"  style="float:right; aria-hidden:true;""></span>
				<input type="text", placeholder="Search" style="float:right;"/>
				
				<select id="dropdownMenu1" style="float:right; padding:5px 5px;">
		    			<option>Select Catogiry<span class="caret"></span></option>
		    			<option><a href="#">Mobiles</a></option>
		    			<option><a href="#">Computers</a></option>
		  		</select>
		  </div>
		  <div class="clearfix"></div>
	  </div>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
