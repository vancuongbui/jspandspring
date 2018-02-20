<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi there this is the home page</h1>
<h2>Here is the infor getting from session of controller</h2>
<%= session.getAttribute("name")	
%>
<c:out value="${name}"></c:out>

<!--
<sql:query var="rs" dataSource="jdbc/spring">
select id,name,email,text from offers
</sql:query>  
-->

<c:forEach var="row" items="${offers}">
<h3>This is the query using controller/service class</h3>
	<p>ID: ${row.id }</p>
    <p>Name: ${row.name}</p>
    <p>Email ${row.email}</p>
    <p>Text ${row.text}<
</c:forEach>
</body>
</html>