<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOG IN PAGE</title>
<style>
body {
    background-color: #FFF;
    color: black;
}
.header{
		color : white;
		padding : 15px;
		
		width: 100px;
		length: 100px;
}
.form{
	
		background-color: #FFF;
		color: #033;
		width: 400px;
		margin : 50px auto;
		border-radius: 10px;
		border:2px solid #ccc;
		padding: 10px 40px 25px;
		margin-top: 70px;

}
</style>

</head>
<body>
<center>
<div class="header">
<img src="logo-uitm.png" width="300%" length="300%">
</div>

<br>

<form action="" method="POST">

<div class="form">
<h2>STAFF LOG IN</h2>
<table align="center">
	<tr>
		<td>Username: </td>
  		<td><input type="text" name="username"></td>
  	</tr>
  	<tr>
  		<td>Password: </td>
  		<td><input type="password" name="password"></td>
  	</tr>
  	<tr>
  		<td></td>
  		<td><input type="submit" value="Login" /></td> 
  	</tr>
  </table>
 </div>
</form>
</center>

</body>
</html>