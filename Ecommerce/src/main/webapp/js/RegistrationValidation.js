$(function(){
$("#submit").click(
		function validate(){
		var firstName =$("#exampleInputFirstName").val();
		var lastName = $("#exampleInputLastName").val();
		var email = $("#exampleInputEmail").val();
		var password = $("#exampleInputPassword").val();
		var confirmPassword = $("#exampleInputConfirmPassword").val();
		var city = $("#exampleInputCity").val();
		var pincode = $("#exampleInputPincode").val();
		var mobileNumber = $("#exampleInputMobileNumber").val();
		
		//var mail = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/;
		//var mail = /[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.$[com])/;
		//var pas = /^[[A-Z]+[a-z]+[0-9]+[\@\#\!\$\%\^\&\*\_\+\-\=\.\?\;\:\|\\\/]?]{8, 10}/;
		var pin = /^[0-9]{6}$/;
		var mob = /^[0-9]{10}$/;
		var pas = /^[a-zA-Z0-9!@#$%^&*]{6,10}$/;
		var mail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;		
		if(firstName == ""){
			$("#firstName").removeAttr("hidden");
			$("#registerationForm").focus();
			return false;
		}

		else if(lastName == ""){
			$("#lastName").removeAttr("hidden");
			return false;
			
		}
		else if(email == ""){
			$("#email").removeAttr("hidden");
			return false;
		
		}

		else if(password == ""){
			$("#password").removeAttr("hidden");
			return false;
			
		}

		else if(confirmPassword == ""){
			$("#confirmPassword").removeAttr("hidden");
			return false;
			
		}

		else if(city == ""){
			$("#city").removeAttr("hidden");
			return false;
			
		}
		
		else if(pincode == ""){
			$("#pincode").removeAttr("hidden");
			return false;
			
		}
		else if(mobileNumber == ""){
			$("#mobileNumber").removeAttr("hidden");
			return false;
			
		}
		
		else if(pin.test(pincode) == false)
		{	
			$("#pincode").removeAttr("hidden").text("Enter the valid Pin Number(Like : 505153)");
			return false;
			
		}
		
		else if(mob.test(mobileNumber) == false)
		{	
			$("#mobileNumber").removeAttr("hidden").text("Enter the valid Mobile Number(Like : 9566137117)");
			return false;

		}

		else if(mail.test(email) == false)
		{	//alert(mail.test(email));
			$("#email").removeAttr("hidden").text("Enter the valid Email ID(Like : name@gmail.com)");
			return false;
			
		}
		else if(password != confirmPassword){
			//alert(password == confirmPassword);
			$("#confirmPassword").removeAttr("hidden").text("confirm password should match password");
			return false;	
		}

		else if(pas.test(password) == false)
		{	//alert(pas.test(password));
			$("#password").removeAttr("hidden").text("Enter the valid Password(must have 6-10 characters)");
			return false;
		}
		else{
			window.location("login.html");
			return true;
		}

	});
	$("#exampleInputFirstName").focus(function(){
		$("#firstName").attr("hidden", "hidden");
	});
	
	$("#exampleInputLastName").focus(function(){
		$("#lastName").attr("hidden", "hidden");
	});
	
	$("#exampleInputEmail").focus(function(){
		$("#email").attr("hidden", "hidden");
	});
	
	$("#exampleInputPassword").focus(function(){
		$("#password").attr("hidden", "hidden");
	});
	
	$("#exampleInputConfirmPassword").focus(function(){
		$("#confirmPassword").attr("hidden", "hidden");
	});
	
	$("#exampleInputPassword").focus(function(){
		$("#password").attr("hidden", "hidden");
	});
	
	$("#exampleInputPincode").focus(function(){
		$("#pincode").attr("hidden", "hidden");
	});
	
	$("#exampleInputMobileNumber").focus(function(){
		$("#mobileNumber").attr("hidden", "hidden");
	});
	
});


