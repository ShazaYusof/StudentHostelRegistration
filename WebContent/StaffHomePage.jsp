<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Homepage</title>
<style>
.header{
		color : white;
		padding : 15px;
		
		width: 100px;
		length: 100px;
}

.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
.button5 {
    background-color: white;
    color: black;
    border: 2px solid #555555;
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

<h2> WELCOME BACK, STAFF!</h2>



<br>
	<table>
		<tr>
		<td><button class="button button5" type="button" onclick="window.location.href='StaffDetails.jsp'">MY INFORMATION</button></td>
		<td><button class="button button5" type="button" onclick="window.location.href='StaffUpdateViewStudent'">UPDATE HOSTEL APPLICATION FORM</button></td>
		<td><button class="button button5" type="button" onclick="window.location.href='StaffViewRoom'">ROOM AVAILABILITY</button></td>
		</tr>
		
		
	</table>

<br><br><br><br><br><br><br><br><br><br><br><br><br>
	<small>

		<br><a href="StaffLogout">Logout</a> 
		</small>

</center>
</body>
</html>