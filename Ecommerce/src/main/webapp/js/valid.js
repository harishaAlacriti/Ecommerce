$(function(){
	var name=/^[a-zA-Z]+$/ ;

	$("#exampleInputFirstName").keydown(function(){
		var fname = $("#exampleInputFirstName").val();
		if(fname.match(name)){
			$("#firstName").html("<b>OK</b>").css("color","blue");
		}
		else{
			$("#firstName").html("<b>No numbers</b>").css("color","red");
		}
	});

	$("#exampleInputLastName").keydown(function(){
		var lname = $("#exampleInputLastName").val();
		if(lname.match(name)){
			$("#lastName").html("<b>OK</b>").css("color","blue");
		}
		else{
			$("#lastName").html("<b>No numbers</b>").css("color","red");
		}
	});
	
	var mail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	$("#exampleInputEmail").keyup(function(){
		var email=$("#exampleInputEmail").val();
		if(email.match(mail)){
			$("#email").html("<b>OK</b>").css("color","blue");
		}
		else{
			$("#email").html("<b>No numbers</b>").css("color","red");
		}
	});
	
	var pas = /^[a-zA-Z0-9!@#$%^&*]{6,10}$/;
	$("#exampleInputPassword").keyup(function(){
		var password = $("#exampleInputPassword").val();
		if(password.match(pas)){
			$("#password").html("<b>strong</b>").css("color","blue");
		}
		else{
			$("#password").html("<b>weak</b>").css("color","red");
		}
	});
	
	var pin = /^[0-9]{6}$/;
	$("#exampleInputPincode").keyup(function(){
		var pincode=$("#exampleInputPincode").val();
		if(pincode.match(pin)){
			$("#pincode").html("<b>OK</b>").css("color","blue");
		}
		else{
			$("#pincode").html("<b>Not Ok</b>").css("color","red");
		}
	});
	var mob = /^[0-9]{10}$/;
	$("#exampleInputMobileNumber").keyup(function(){
		var mobileNumber = $("#exampleInputMobileNumber").val();
		if(mobileNumber.match(mob)){
			$("#mobileNumber").html("<b>OK</b>").css("color","blue");
		}
		else{
			$("#mobileNumber").html("<b>Not Ok</b>").css("color","blue");
		}
	}); 
	
	$("#exampleInputConfirmPassword").keyup(function(){
		var confirmPas=$("#exampleInputConfirmPassword").val();
		var pas=$("#exampleInputPassword").val();
		if(confirmPas == pas){
			$("#confirmPassword").html("<b>matched</b>").css("color", "blue");
		}
		else{
			$("#confirmPassword").html("<b>not matching</b>").css("color", "blue");
		}
	});
	
	$("#exampleInputFirstName").blur(function(){
		$("#firstName").hide();
	});
	
});