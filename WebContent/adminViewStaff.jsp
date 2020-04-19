<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff List</title>
<style>
.header{
		color : white;
		padding : 15px;
		width: 100px;
		length: 100px;
}
table {
    border-collapse: collapse;
	width:80%;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
table, th, td {
   border: 2px solid #E1E1E1;
}

th{
	text-align: center;
	background-color: #787878;
    color: white;
	height:50px;
}

td{
	height: 50px;
	padding-left:5px;
	padding-right:5px;
}
tr:nth-child(even) {background-color: #f2f2f2}
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
<h2> HELLO, ADMIN!</h2>
<br>

<table align="center" class="table">
	<tr>
    	<th>STAFF ID</th>
        <th>STAFF NAME</th>
        <th>STAFF ADDRESS</th>
        <th>STAFF PHONE NO.</th>
        <th>EMAIL</th>
        <th colspan="2">MANAGE</th>
    </tr>
    
    <c:forEach items="${staffs}" var="staff">
		<tr>
			<td> ${staff.staffID} </td>
			<td> ${staff.staffName} </td>
			<td> ${staff.staffAdd} </td>
			<td> ${staff.staffPNo} </td>
			<td> ${staff.staffEmail} </td>
			<td colspan="2"> <a href="StaffDelete?staffID=${staff.staffID}"> Delete</a>  </td>
		</tr>
	</c:forEach>
</table>



<br><br><br>
<button class="button button5" align ="right" onclick="window.location.href='StaffRegister.jsp'"/> + ADD STAFF</button>

<br><br>
<input type="button" value="back" onclick="window.location.href='AdminHomePage.jsp'"/>


</center>


<br><br><br><br>
<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>

</body>
</html>