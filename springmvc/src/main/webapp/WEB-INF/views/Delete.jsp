<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Header.jsp"%>
<%
String errMsg = (String) request.getAttribute("errMsg");
String msg = (String) request.getAttribute("msg");
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
<title>Delete</title>
</head>
<body>
	<h1 style="color: red;">
		<%
		if (errMsg != null && !errMsg.isEmpty()) {
		%>

		<%=errMsg%>

		<%
		}
		%>
	</h1>
	<fieldset>
		<legend>Search</legend>
		<form action="./delete" method="get">
			<table>
				<tr>

					<td>Enter Id</td>
					<td><input type="text" name="id"></td>

				</tr>

				<tr>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h2>
		<%=msg%>
	</h2>

	<%
	}
	%>
</body>
</html>