<%@page import="com.te.springmvc.beans.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="Header.jsp" %>
<% List<EmployeeBean> list = (List<EmployeeBean>) request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Employees List</h1>
 <hr>
	<%
	
	for(int i=0; i<list.size() ;i++) { %>

 <h2>	<%= (i+1) + ". " + list.get(i).getName()+"\n" %>   </h2>

	<% } %>

</body>
</html>