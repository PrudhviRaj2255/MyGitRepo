<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String name = (String) request.getAttribute("user");
       int password = (int) request.getAttribute("pwd");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	h1 {
		text-align: center;
	}
</style>
<title>Welcome</title>
</head>
<body>

	<h1> Name : <%= name %> </h1>
	<br> <hr>
	<h1> Password : <%= password %> </h1>
	
</body>
</html>