<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Login</title>
</head>
<body>
	<h1 style="color: red;">
		<%
		if (errMsg != null && !errMsg.isEmpty()) {
		%>

		<%= errMsg %>

		<%
		}
		%>
	</h1>
	<fieldset>
		<legend>Login</legend>
		<form action="./empLogin" method="post">
			<table>
				<tr>
					<td>Enter Id</td>
					<td>:</td>
					<td><input type="text" name="id" required="required"></td>
				</tr>

				<tr>
					<td>Enter Password</td>
					<td>:</td>
					<td><input type="password" name="pwd" required="required"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Login"></td>
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