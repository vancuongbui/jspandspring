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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascripts/javascripts.js" ></script>
<title>Insert title here</title>
</head>
<body>

<!-- This is the nav menu -->
	 <%@ include file="security_nav.html" %>  
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<h1>Create account</h1>
				<form method="post" action="${pageContext.request.contextPath}/createaccount" 
				class="form-group" commonName="user" modelAttribute="userForm" id="signupForm">
					
					<p>	<label for="username">Email Address: </label>
						<input type="text" class="form-control" path="username" name="username" id="username" required="required" />
						
						<span class="errors">${userErrorMessage}</span>
						<span id="wrongEmailFormat" data-dismiss="alert">${userErrorMessage}</span>
					</p>
					<p>	<label for="password">Password: </label>
						<input type="text" class="form-control" id="password" path="password" name="password" required="required"/>
						<span class="errors">${passErrorMessage}</span>
						<span class="errors">${passMismatched}</span>
						<span id="test" ></span>
					</p>	
					<p>	<label for="confirmPassword">Confirm Password </label>
						<input type="text" class="form-control" path="confirmPassword" name="confirmPassword" id="confirmPassword" required="required"/>
						<span id="test1"></span>
					</p>					
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					</p>
					<p>	<input type="submit" value="Create Account" class="btn btn-primary"id="submit"/>
						<input type="reset" value="reset" class="btn btn-danger"/>
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/"/>Cancel</a>
					</p>
				</form>
			</div>
			<aside class="col-md-4 center-block">			
				
				<%@ include file="aside.html" %>
			</aside>
		</div>
	</div>
	<footer>
	</footer>

</body>
</html>