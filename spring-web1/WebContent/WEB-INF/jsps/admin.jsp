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
	 <%@ include file="security_nav.html" %>  
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8">
				<h1 class="text-center">THIS IS THE ADMIN PAGE</h1>
				<h3 class="text-center">The list of users</h3>
				<table class="table table-striped">
					<tr>
						<th>Username</th>
						<th>Role</th>						
					</tr>
					<c:forEach var="user" items="${adminUsers}">
					<tr>			
							<td>${user.username }</td>
						    <td>${user.authorities}</td>		   
						
					</tr>		
					</c:forEach>
				</table>
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