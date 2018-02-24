<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Delete Offer</title>
</head>
<body>
<h1>Delete Offer Form</h1>
<form method="post" action="${pageContext.request.contextPath}/deleteoffer" class="form-group" commonName="offer" >
	
	<p>	<label for="id">Name: </label>
		<input type="text" class="form-control" path="id" name="id" required="required"/>
		
	</p>
	
	<p>	<input type="submit" value="Delete Offer" class="btn btn-primary"/>
		<input type="reset" value="cancel" class="btn btn-danger"/>
	</p>
</form>
</body>
</html>