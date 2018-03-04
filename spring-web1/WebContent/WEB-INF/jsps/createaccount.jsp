<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
<title>Insert title here</title>
</head>
<body>
<!-- This is the nav menu -->
	<security:authorize access="isAuthenticated()">
        <%@ include file="navbar.html" %>
    </security:authorize>
    <security:authorize access="isAnonymous()">
        <%@ include file="nav_login.html" %>
    </security:authorize>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<h3>You have created your account successfully</h3>
				<h3>Your account detail</h3>
				<p>Your email/username: ${user.username }</p>
			    <p>Your Password: ${user.password}</p>			    
			</div>
			<div class="col-md-4">
				<%@ include file="aside.html" %>
			</div>
		</div>
	</div>
	<footer>
	</footer>	
</body>
</html>