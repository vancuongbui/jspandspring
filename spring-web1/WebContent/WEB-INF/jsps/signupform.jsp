<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="${pageContext.request.contextPath}/static/javascripts/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#confirmPassword").mouseleave(function(){
			if ($("#password").val() != $("#confirmPassword").val()) {
				$("#test").text("password mismatched");						
			}
			else {
				$("#test").text("");
			};
		});	
	});
	
</script>
<title>Insert title here</title>
</head>
<body>

<!-- This is the nav menu -->
	<%@ include file="nav_login.html" %>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<h1>Create account</h1>
				<form method="post" action="${pageContext.request.contextPath}/createaccount" 
				class="form-group" commonName="user" modelAttribute="userForm">
					
					<p>	<label for="username">Email Address: </label>
						<input type="text" class="form-control" path="username" name="username" required="required" />
						
						<span class="errors">${userErrorMessage}</span>
					</p>
					<p>	<label for="password">Password: </label>
						<input type="text" class="form-control" id="password" path="password" name="password" required="required"/>
						<span class="errors">${passErrorMessage}</span>
						<span class="errors">${passMismatched}</span>
						<span id="test">Test Jquery function</span>
					</p>	
					<p>	<label for="confirmPassword">Confirm Password </label>
						<input type="text" class="form-control" path="confirmPassword" name="confirmPassword" id="confirmPassword" required="required"/>
					</p>					
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					</p>
					<p>	<input type="submit" value="Create Account" class="btn btn-primary"/>
						<input type="reset" value="reset" class="btn btn-danger"/>
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/"/>Cancel</a>
					</p>
				</form>
			</div>
			<div class="col-md-4">
			</div>
		</div>
	</div>
	<footer>
	</footer>

</body>
</html>