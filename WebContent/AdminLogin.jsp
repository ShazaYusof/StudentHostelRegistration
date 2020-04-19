<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		padding : 0px;
		
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
<br><br>
<div class="image">
<img src="logouitm.png" width="25%" length="15%" >
</div>
</center>
<body background="3.jpg" width="100%" height="100%" >
<center>

<br>

<form action="AdminLogin" method="POST">

<div class="form">
<h2>ADMIN LOG IN</h2>
<table align="center">
	<tr>
		<td>Username: </td>
  		<td><input type="text" name="adUsername"></td>
  	</tr>
  	<tr>
  		<td>Password: </td>
  		<td><input type="password" name="adPassword"></td>
  	</tr>
  	<tr>
  		<td></td>
  		<td><input type="submit" value="Login" /></td> 
  	</tr>
  </table>
 </div>
</form>
</center>
		<c:if test="${loginerror == 'yes'}">
		<h3 align="center">
    		Invalid username and password
    	</h3>
        </c:if>
<center>
<p> <a href="homepage.jsp"> Home </a> </p>
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</center>
</body>
</html>