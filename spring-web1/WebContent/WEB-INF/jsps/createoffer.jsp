<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
	<%@ include file="navbar.html" %>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<p>ID: ${offer.id }</p>
			    <p>Name: ${offer.name}</p>
			    <p>Email: ${offer.email}</p>
			    <p>Text: ${offer.text}<
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