<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Register Success</title>
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
<div class="login">

<form method="POST" action="StaffRegister" >

<jsp:useBean scope="request" id="staffbean" class="com.hostel.model.StaffBean" />

<h1>Thank You for Registering :)</h1>
<table >
<tbody>  

	
	<tr>
		<td>Name:</td>
		<td> <jsp:getProperty property="staffName" name="staffbean"/></td>
	</tr>
	<tr>
		<td>Address:</td>
		<td> <jsp:getProperty property="staffAdd" name="staffbean"/></td>
	</tr>
	<tr>
		<td>Phone No:</td>
		<td> <jsp:getProperty property="staffPNo" name="staffbean"/></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td> <jsp:getProperty property="staffEmail" name="staffbean"/></td>
	</tr>
	<tr>
		<td>Username:</td>
		<td> <jsp:getProperty property="staffUsername" name="staffbean"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td> ***** </td>
	</tr>
	
</tbody>
</table>
	
</form>
</div>

<input type="button" value="back" onclick="window.location.href='AdminHomePage.jsp'"/>

</center>
<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>
</body>

</html>