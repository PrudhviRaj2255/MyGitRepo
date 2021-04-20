<%@page import="com.te.springmvc.beans.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Header.jsp" %>
	<% String msg = (String) request.getAttribute("msg"); 
	   EmployeeBean bean = (EmployeeBean) request.getAttribute("data");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
fieldset {
	margin: 250px auto;
	length: 300px;
	width: 300px;
}
</style>
<title>Search</title>
</head>
<body>
<% if(msg!=null) { %>
<h1> <%= msg %> </h1>
<% } %>
<fieldset>
		<legend>Search</legend>
		<form action="./search" method="get">
			<table>
				<tr>

					<td>Enter Id</td>
					<td><input type="text" name="id"></td>

				</tr>
				
				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>

			</table>
		</form>
	</fieldset>
	
<h4>	<% if(bean!=null) { %> </h4>
<h4>	<%= bean.getName() %> </h4>
<h4>	<%= bean.getId() %> </h4>
<h4>	<%= bean.getDob() %> </h4>
	
	<% } %>
</body>
</html>