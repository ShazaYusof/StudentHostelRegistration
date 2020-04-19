<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hostel Result</title>
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
    text-align: center;
    padding: 8px;
}

tr:nth-child{background-color: #f2f2f2}

th {
    background-color: lightgrey;
    color: black;
}

.footer{
		background-color:#FFF;
		color:#000;
		padding : 15px;
		font-family:Georgia, "Times New Roman", Times, serif;
		alignment-adjust:central;
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
<h2> CONGRATULATIONS :)</h2>

<div class="form">
<table>
	<tr>
		<td colspan="2"><b> COLLEGE APPLICATION RESULT</b></td>
	</tr>
	<tr>
		<td>Student Matric No. : </td>
		<td></td>
	</tr>
	<tr>
		<td>Srudent IC Number : </td>
		<td></td>
	</tr>
	<tr>
		<td>Student Name : </td>
		<td></td>
	</tr>
	<tr>
		<td>Course : </td>
		<td></td>
	</tr>
	<tr>
		<td>Semester : </td>
		<td></td>
	</tr>
	<tr>
		<td>Application Status : </td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="button" value="College Form" onclick="window.location.href='CollegeRegisterForm.jsp'"></td>
	</tr>
</table>
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