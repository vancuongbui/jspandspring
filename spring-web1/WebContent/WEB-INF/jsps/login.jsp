<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
</head>
<body onload='document.f.username.focus();'>
<!-- This is the nav menu -->
	 <%@ include file="security_nav.html" %>  
<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>Login with Username and Password</h3>
			<form name="f" action="login" method="POST" class="form-group">
				<c:if test="param.error !=null">
					<span class="dander">username and password not matched</span>
				</c:if>
				
				<p>	<label for="username">Name: </label>
					<input type="text" class="form-control" path="username" name="username" required="required"/>			
				</p>
				<p>	<label for="password">Name: </label>
					<input type="text" class="form-control" path="password" name="password" required="required"/>			
				</p>
				<p>	<input type="submit" value="Login" class="btn btn-primary"/>
					<input type="reset" value="reset" class="btn btn-danger"/>
					<a class="btn btn-danger" href="${pageContext.request.contextPath}/"/>Cancel</a>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				</p>				
			</form>
		</div>
		<aside class="col-md-4 center-block">			
				
				<%@ include file="aside.html" %>
			</aside>	
	</div>
</div>
</body>
</html>