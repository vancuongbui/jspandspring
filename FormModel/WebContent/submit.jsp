<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted Information</h1>
<h3>Your fullname: <%= request.getParameter("fullname") %> </h3>
<h3>Your gender: <%= request.getParameter("gender") %> </h3>
<h3>Your Language: 

<%

String[] theLanguage = request.getParameterValues("language[]");
if (theLanguage == null) {
	out.println("Cannot get the infor array");
}
else {
	int languageNumber = theLanguage.length;
	for (int i=0; i< languageNumber; i++) {
		out.println(theLanguage[i]);
	}
	
}
%> </h3>
<h3>Your Country: <%= request.getParameter("country") %> </h3>


</body>
</html>