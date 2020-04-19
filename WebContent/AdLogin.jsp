<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="image">
	<background-image="first.jpg" width="100%" height="50%" >
	</div>
	<div class="panel heading" style="background: black; width: 700px;">
     	<div style="text-align:center; color: white">ADMIN LOGIN</div>
    </div>
    <div class="panel body">
    <form action="AdminLogin" method="POST">
    <table>
		<tr>
			<td>USERNAME :</td>
			<td><input type="text" name="adUsername"></td>
		</tr>
		
		<tr>
			<td>PASSWORD :</td>
			<td><input type="password" name="adPassword"></td>
		</tr>
			<tr>
			<td></td>
			<td><input type="submit" value="Login" style="margin-left:91px"></td>
		</tr>
		</table>
		</form>
		<table>
		<tr>
			<td colspan="2"> Are you new? Register <a href="register.jsp">here</a></td>
		</tr>
	    </table>
	
    </div>
    <c:if test="${loginerror == 'yes'}">
    Invalid username and password
    </c:if>
</body>
</html>