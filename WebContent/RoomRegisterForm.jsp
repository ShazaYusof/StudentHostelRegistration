<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room  Form</title>
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
<br><br>
<h2> WELCOME, STUDENT!</h2>


<form action="StudentRoomUpdate" method="POST">

<div class="form">
<h2>ROOM FORM</h2>
<table align="center">
<c:forEach items="${room}" var="room">
	<tr>
		<td>Room No:</td>
  		<td><input type="text" name="roomID" value=${room.roomID}></td>
  	</tr>
  	<tr>
  		<td>Room Status: </td>
  		<td>${room.roomStatus }<td>
  	</tr>
  	<tr>
  		<td><input type="hidden" name="studID" value="${studentinfo.studID}"></td>
	  	<td><input type="submit" value="SELECT"></td>
  	</tr>
</c:forEach>
  </table>
 </div>
</form>
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