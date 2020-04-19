<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hostel Registration Form</title>
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
		width: 600px;
		margin : 50px auto;
		border-radius: 10px;
		border:2px solid #ccc;
		padding: 10px 40px 25px;
		margin-top: 70px;

}
table {
    border-collapse: collapse;
    width: 100%;
}
th
{
	text-align: center;
    padding: 8px;
}
td {
    text-align: right;
    padding: 8px;
}

tr:nth-child{background-color: #f2f2f2}

th {
    background-color: lightgrey;
    color: black;
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

<br>
<div class="form">
<form action="StudentRegister" method="POST">
<table>
	  <tr>
	    <th colspan="3">A. STUDENT INFORMATION</th>
	  </tr>
	  <tr>
	    <td colspan="2">Matric Number :</td>
	    <td><input type="text" name="studMatric"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Identity Card Number:</td>
	    <td><input type="text" name="studIC"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Student Name :</td>
	    <td><input type="text" name="studName"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Address :</td>
	    <td><textarea name="studAdd" rows="3" cols="30"></textarea>
	  </tr>
	  <tr>
	    <td colspan="2">Phone Number :</td>
	    <td><input type="text" name="studPhoneNo"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Email :</td>
	    <td><input type="text" name="studEmail"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Course :</td>
	    <td><input type="text" name="studCourse"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Semester :</td>
	    <td><input type="text" name="studSemester"></td>
	  </tr>
	  <tr>
	    <td colspan="2">Password :</td>
	    <td><input type="text" name="studPassword"></td>
	  </tr>
	   
	  <tr>
	  	<td colspan="2"></td>
	  	<td><input type="submit" value="REGISTER>>"></td>
	  	<td></td>
	  </tr>
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