<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Register</title>
</head>
<style>
.login{
	background-color:#FFF;
	width:360px;
	margin:50px auto;
	font:"Century Gothic";
	border-radius:10px;
	border:2px solid #ccc;
	padding:10px 40px 25px;
	margin-top:70px;
	}
	
.header{
		color : white;
		padding : 15px;
		width: 100px;
		length: 100px;
}
</style>

<body>
<center>
<br><br>
<div class="image">
<img src="logouitm.png" width="25%" length="15%" >
</div>
</center>
<body background="5.jpg"  width="100%" height="100%" >

<center>
<br><br><br>
<h2>STAFF REGISTRATION</h2>
	<div class="login">
	<h1 align="center"> </h1>

		<form method="POST" action="StaffRegister" >
			<table>
				<tbody>
					<tr>
						<td>Staff Name:</td>
						<td> <input type="text" name="staffName"></td>
					</tr>
					<tr>
						<td>Staff Address:</td>
						<td> <input type="text" name="staffAdd"></td>
					</tr>
					<tr>
						<td>Staff Phone No:</td>
						<td><input type="text" name="staffPNo"></td>
					</tr>
					<tr>
						<td>Staff Email:</td>
						<td> <input type="text"  name="staffEmail"></td>
					</tr>
					<tr>
						<td>Staff Username:</td>
						<td> <input type="text" name="staffUsername"></td>
					</tr>
					<tr>
						<td>Staff Password:</td>
						<td> <input type="password" name="staffPassword"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Register" ></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	</center>
	<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>
</body>

</html>