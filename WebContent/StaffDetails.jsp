<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Update Form</title>
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
<table>
	  <tr>
	    <th colspan="3">STAFF INFORMATION</th>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Staff ID :</td>
	    <td>${staffinfo.staffID}</td>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Name :</td>
	    <td>${staffinfo.staffName}</td>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Address :</td>
	    <td>${staffinfo.staffAdd}</textarea>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Phone Number :</td>
	    <td>${staffinfo.staffPNo}</td>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Email :</td>
	    <td>${staffinfo.staffEmail}</td>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Username :</td>
	    <td>${staffinfo.staffUsername}</td>
	  </tr>
	  
	  <tr>
	    <td colspan="2">Password :</td>
	    <td>${staffinfo.staffPassword}</td>
	  </tr>
	  
	  <tr>
	  	<td colspan="2"></td>
	  	<td><button class="button button5" type="button" onclick="window.location.href='StaffUpdateView'">UPDATE DETAILS >></button></td>
	  	<td></td>
	  </tr>

</table>
</div>

<br><br>
<input type="button" value="back" onclick="window.location.href='StaffHomePage.jsp'"/>
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
