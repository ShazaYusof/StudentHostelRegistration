<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home Page</title>
<style>
.header{
		color : white;
		padding : 15px;
		width: 100px;
		length: 100px;
}
table {
    border-collapse: collapse;
    width: 25%;
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
.button {
    background-color: light grey; 
    border: none;
    color: black;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 20px;
    margin: 4px 2px;
    cursor: pointer;
}

</style>
</head>
<body>

<center>
<div class="header">
<img src="logouitm.png" width="300%" length="300%">
</div>

<h2> WELCOME BACK, ADMIN!</h2>
		<p>
			Hi,
			Hope you have a productive day today.
	   </p>

<br>
<table>
		<tr>
			<td><a href="StaffRegister" class="button">REGISTER STAFF</a></td>
			<td><a href="#" class="button">VIEW STAFF</a></td>
		</tr>
		
	</table>


	
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br>
	<small>
		You logged in as  
		<br><a href="">Logout</a> 
		</small>
	



</center>

</body>
</html>