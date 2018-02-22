<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<h1>This is the Offer form</h1>
<form method="post" action="${pageContext.request.contextPath}/createoffer" class="form-group" >
	
	<p>	<label for="name">Name: </label>
		<input type="text" class="form-control" id="name" name="name" required="required"/>
	</p>
	<p>	<label for="email">Email: </label>
		<input type="text" class="form-control" id="email" name="email" required="required"/>
	</p>
	<p>	<label for="text">Text: </label>
		<textarea class="form-control" id="text" name="text"></textarea>
	</p>
	<p>	<input type="submit" value="Submit form" class="btn btn-primary"/>
		<input type="reset" value="cancel" class="btn btn-danger"/>
	</p>
</form>
</body>
</html>