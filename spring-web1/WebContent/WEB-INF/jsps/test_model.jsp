<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is the test_model page</h1>
<h2>This is the info passed by Model from controller: </h2>
<%= request.getAttribute("name") %>
<h3>Using Expresion Language: ${ name}</h3>
</body>
</html>