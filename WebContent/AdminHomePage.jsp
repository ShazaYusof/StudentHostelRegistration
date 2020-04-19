<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<body background="5.jpg"  width="100%" height="100%" >

			<h1 align="center"> Hostel registration</h1>
			
			<c:if test="${sessionScope.admininfo == null}">
				<%
					String uri = request.getRequestURI();
					String pageName = uri.substring(uri.lastIndexOf("/") + 1);
					
					if(pageName.equals("AdminLogin.jsp") == false)
					{
						response.sendRedirect("AdminLogin.jsp");
					}
				%>
			</c:if>
			
			<c:if test="${sessionScope.admininfo != null }">
				<center>
				<center>
				<br><br>
				<div class="image">
				<img src="logouitm.png" width="25%" length="15%" >
				</div>
				</center>
				
				<h2> WELCOME BACK, ADMIN!</h2>
				
				<br>
				<table>
					<tr>
						<td><a href="StaffRegister.jsp" class="button">REGISTER STAFF</a></td>
						<td><a href="StaffView" class="button">VIEW STAFF</a></td>
					</tr>
		
				</table>
			</c:if>
			<br><br><br><br><br><br><br>
			<center>
			<footer>
			<a href="AdminLogout">Log Out</a>
			</footer>
			</center>
</body>
</html>