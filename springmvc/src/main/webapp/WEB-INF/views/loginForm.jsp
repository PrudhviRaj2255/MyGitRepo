<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<fieldset>
		<legend>Login</legend>
		<!-- <form action="./login" method="post"> 
		
		<form action="./login1" method="post"> 

		<form action="./login2" method="post"> -->

		<form action="./login3" method="post">
			<table>
				<tr>
					<td>Enter Name</td>
					<td>:</td>
					<td><input type="text" name="user" required="required"></td>
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
</body>
</html>