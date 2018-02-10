<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-8">
			<form class="form-group" method ="post" action="/FormModel/FormClass">
				<fieldset>
					<legend>Please Login
						<p>
							<label for="email">Email: </label>
							<input class="form-control" type="email" id="email" value="" required="required" name="email" placeholder="Enter your email"/>
						</p>
						<p >
							<label for="password">Password: </label>
							<input class="form-control" type="password" id="password" value="" name="password" required="required"/>
						</p>
						<p>
							<input type="submit" value="Login" class="btn btn-primary"/>
							<input type="reset" class="btn btn-danger" value="Cancel"/>
						</p>
					</legend>
				</fieldset>
			</form>
		</div>
		<div class="col-sm-4">
			<h3>This is the aside container</h3>
		</div>
	</div>
</div>
</body>
</html>