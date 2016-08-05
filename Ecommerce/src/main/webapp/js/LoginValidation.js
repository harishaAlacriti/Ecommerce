$(function(){
	$("#signIn").click(
	function validate(){
		var email = $("#exampleInputEmail").val();
		var password = $("#exampleInputPassword").val();
		var mail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		var pas = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
		if(email == ""){
			$("#email").removeAttr("hidden");
			return false;
		}

		else if(password == ""){
			$("#password").removeAttr("hidden");
			return false;
		}

		else if(mail.test(email) == false)
		{	//alert(mail.test(email));
			$("#email").removeAttr("hidden").text("Enter the valid Email ID(Like : name@gmail.com)");
			return false;
		}

		else if(pas.test(password) == false)
		{	alert(pas.test(password));
			$("#password").removeAttr("hidden").text("Enter the valid Password(must have 8 characters)");
			return false;
		}

		else{
			return true;		
		}
	});

	$("#exampleInputEmail").focus(function(){
		$("#email").attr("hidden", "hidden");
	});
	$("#exampleInputPassword").focus(function(){
		$("#password").attr("hidden", "hidden");
	});
	$("#exampleInputEmail").focus(function(){
		$("#email").attr("hidden", "hidden");
	});
	$("#exampleInputPassword").focus(function(){
		$("#password").attr("hidden", "hidden");
	});
});
