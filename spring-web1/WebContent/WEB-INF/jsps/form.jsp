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
<title>Insert title here</title>
</head>
<body>
<!-- This is the nav menu -->
	<%@ include file="navbar.html" %>
	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<h1>This is the Offer form</h1>
				<form method="post" action="${pageContext.request.contextPath}/createoffer" class="form-group" commonName="offer" >
					
					<p>	<label for="name">Name: </label>
						<input type="text" class="form-control" path="name" name="name" required="required"/>
						<sf:errors path="name" cssClass="error"></sf:errors>
					</p>
					<p>	<label for="email">Email: </label>
						<input type="text" class="form-control" path="email" name="email" required="required"/>
					</p>
					<p>	<label for="text">Text: </label>
						<textarea class="form-control" path="text" name="text"></textarea>
					</p>
					<p>
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					</p>
					<p>	<input type="submit" value="Submit form" class="btn btn-primary"/>
						<input type="reset" value="reset" class="btn btn-danger"/>
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/"/>Cancel</a>
					</p>
				</form>
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