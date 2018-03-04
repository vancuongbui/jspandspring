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
				<h3>This is the query using controller/service class</h3>
				<table class="table table-striped">
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Text</th>
					</tr>
					<c:forEach var="offer" items="${offers}">
					<tr>			
							<td>${offer.id }</td>
						    <td>${offer.name}</td>
						    <td>${offer.email}</td>
						    <td>${offer.text}</td>
						
					</tr>		
					</c:forEach>
				</table>
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