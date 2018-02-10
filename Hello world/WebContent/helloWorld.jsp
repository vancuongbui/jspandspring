<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous"><!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<h1>Hello World from JSP file</h1>
	</div>
	<div class="row">
		
<!-- Java -->
<%=
	"<h2>and now you see Hello World JSP from Java</h2>"
%>

<%
java.util.Date today = new java.util.Date();
String text="Today is: " + today.toString() + "\n";	

%>

<%
int age = 12;
out.println("My age is: " + age + "\n");
if (age > 18) {
	out.println("I am an adult");
}
else {
	out.println("I am a teenager");
}
%>
	</div>
	<div class="row">
		<!-- declaration  -->
		<%!
			String message() {
				return "Hello function inside JSP file - declaration practices";
			}
		%>
		<%= message() %>
	</div>
	<div class="row">
		<!-- redirect the page to another -->
		<%
			response.sendRedirect("https://google.com.au");
		%>
	</div>

</div>



</body>
</html>