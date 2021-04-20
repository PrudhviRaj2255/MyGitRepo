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
<title>Add</title>
</head>
<body>
	<fieldset>
		<legend>Search</legend>
		<form action="./add" method="post">
			<table>
				<tr>
					<td>Enter Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				
				<tr>
					<td>Enter Password</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				
				<tr>
					<td>Enter Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				
				<tr>
					<td>Enter Dob</td>
					<td><input type="date" name="dob"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Add"></td>
				</tr>

			</table>
		</form>
	</fieldset>
</body>
</html>