<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Room List</title>
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
<body background="5.jpg"  width="50%" height="50%" >
<center>
<h2> WELCOME BACK, STAFF!</h2>


<table align="center" class="table">
	<tr>
		<th>COLLEGE ID</th>
    	<th>ROOM NUMBER</th>
        <th>ROOM ID</th>
        <th>ROOM LEVEL</th>
        <th>ROOM STATUS</th>
        <th colspan="2">UPDATE STATUS</th>
    </tr>
    
    <c:forEach items="${rooms}" var="room">
		<tr>
			<td> ${room.collID} </td>
			<td> ${room.roomNum} </td>
			<td> ${room.roomID} </td>
			<td> ${room.roomLvl} </td>
			<td> ${room.roomStatus} </td>
			<td colspan="2"> <a href="StaffUpdateRoom?roomNum=${room.roomNum}"> UPDATE</a></td>
		</tr>
	</c:forEach>
</table>
<br><br><br>

<input type="button" value="back" onclick="window.location.href='StaffHomePage.jsp'"/>
<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>
</center>
</body>
</html>