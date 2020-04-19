<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Form</title>
<style>
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
<br><br>
<div class="image">
<img src="logouitm.png" width="25%" length="15%" >
</div>
</center>
<body background="5.jpg"  width="100%" height="100%" >
<center>
<div class="header">
</div>
<br><br>
<h2> WELCOME, STUDENT!</h2>




<div class="form">
<h2>COLLEGE FORM</h2>
<form action="StudentCollegeUpdate" method="POST">
<table align="center">
	<tr>
		<td>College Name: </td>
  		<td>
  			<select name="collName">
		    	<option value="TUN SRI LANANG A">Tun Sri Lanang A
		    	<option value="TUN SRI LANANG B">Tun Sri Lanang B
		    	<option value="TUN GEMALA A">Tun Gemala A
		    	<option value="TUN GEMALA B">Tun Gemala B
		    	</select>
  		</td>
  	</tr>
  	<tr>
  		<td>College Level: </td>
  		<td>
  			<select name="roomLvl">
		    	<option value="1">1
		    	<option value="2">2
		    	</select>
  		</td>
  	</tr>
  	<tr>
  		<td></td>
  		<td></td>
  	</tr>
  	<tr>
  		<td><input type="hidden" name="studID" value="${studentinfo.studID}"></td>
	  	<td><input type="submit" value="NEXT>>"></td>
  	</tr>
  </table>
  </form>
 </div>

<br><br><br><br>
<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>
</center>
</body>
</html>