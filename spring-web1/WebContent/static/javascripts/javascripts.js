/**
 * 
 */

$(document).ready(function(){
	var emailErrorMessage = "";
	var passErrorMessage = "";
	var confirmPassErrorMessage = "";
	$("#username").on("input", function() {
		emailPattern = /^[_A-Za-z0-9-]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$/;
		$(this).mouseleave(function() {
			if (!(emailPattern).test($("#username").val())) {
				emailErrorMessage = emailErrorMessage + "WrongEmailFormat";
			$("#wrongEmailFormat").text("WrongEmailFormat");
			$("#wrongEmailFormat").addClass("alert alert-warning alert-dismissible");
		}
		else {
			emailErrorMessage = "";
			$("#wrongEmailFormat").text("");
			$("#wrongEmailFormat").removeClass("alert alert-warning alert-dismissible");
		}
		})
		
		
	//})	
		//alert(validateMessage);
	})
	//^(?:(?=.*[a-z])(?:(?=.*[A-Z])(?=.*[\d\W])|(?=.*\W)(?=.*\d))|(?=.*\W)(?=.*[A-Z])(?=.*\d)).{8,}$
	$("#password").on("input", function() {
		$(this).mouseleave(function() {
			passwordPattern = /^(?:(?=.*[a-z])(?:(?=.*[A-Z])(?=.*[\d\W])|(?=.*\W)(?=.*\d))|(?=.*\W)(?=.*[A-Z])(?=.*\d)).{8,}$/;
			if (!(passwordPattern).test($("#password").val())) {
				$("#test").addClass("alert alert-warning alert-dismissible");
				$("#test").text("not match the complexity of password");
				passErrorMessage = passErrorMessage + " Invalid password";
			}
			else {
				$("#test").removeClass("alert alert-warning alert-dismissible");
				$("#test").text("");	
				passErrorMessage;
			}
		})
		
		
	})
	$("#confirmPassword").on("input", function() {
		$(this).mouseleave(function() {
			//passwordPattern = /^(?:(?=.*[a-z])(?:(?=.*[A-Z])(?=.*[\d\W])|(?=.*\W)(?=.*\d))|(?=.*\W)(?=.*[A-Z])(?=.*\d)).{8,}$/;
			if ($("#confirmPassword").val()!=$("#password").val()) {
				$("#test1").addClass("alert alert-warning alert-dismissible");
				$("#test1").text("mismatched password");
				confirmPassErrorMessage = confirmPassErrorMessage + " Invalid password";
			}
			else {
				$("#test1").removeClass("alert alert-warning alert-dismissible");
				$("#test1").text("");	
				confirmPassErrorMessage = "";
			}
		})
		
		
	})
	
	$("#submit").click(function() {
		$("#signupForm").on("submit", function(){
			alert(validateMessage);
			var validateMessage = confirmPassErrorMessage + passErrorMessage + emailErrorMessage;
			if (validateMessage == ""){
				return true;
			}
			else {
				return false;
			}
		});
	}) 
	
});
	
