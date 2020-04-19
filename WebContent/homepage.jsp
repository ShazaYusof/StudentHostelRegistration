<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hostel Registration HomePage</title>
</head>

<style>
body{
	background-color:#fff;
}
*{	
	box-sizing:border-box;
}
.image{
	background-color:#fff;
	padding: 5px;
	
}
.header{
		background-color: #fff;
		font-size:40px;
		color : black;
		padding : 15px;
		font-family:Georgia, "Times New Roman", Times, serif;
}
.image{
	
	background-color:#fff;
	padding: 5px;
}
.footer{
		background-color:#FFF;
		color:#000;
		padding : 15px;
		font-family:Georgia, "Times New Roman", Times, serif;
		alignment-adjust:central;
}
h1,h2,h3,h4{
	font-family:Georgia, "Times New Roman", Times, serif;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
	alignment-adjust:central;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: #ccc;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.column {
    float: left;
    width: 50%;
    padding: 15px;
	font-size:13px;
	color:#666;
}
.row:after {
    content: "";
    display: table;
    clear: both;
}
@media (max-width:600px) {
    .column {
        width: 100%;
    }
}
</style>
</head>


<body>

<body background="5.jpg"  width="100%" height="100%" >
<center>
<div class="image">
<img src="logo_uitm_1.jpg" width="20%" height="10%" >
</div>
</center>

<center>
<div class="header">
<marquee><i><b>WELCOME TO UiTM HOSTEL REGISTRATION</b></i></marquee>
</div>
</center>



<font face="Georgia, Times New Roman, Times, serif">
<center>
<ul>
  <li><a href="information.jsp">Information</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Log In</a>
    <div class="dropdown-content" >
      <a href="AdminLogin.jsp">Log In Admin</a>
      <a href="StaffLogin.jsp">Log In Staff</a>
      <a href="StudentLogin.jsp">Log In Student</a>
    </div>
   
  </li>
</ul>
</center>


<div class="image">
<img src="4.jpg" width="100%" height="50%" >
</div>

<div class="row">
	<div class="column" align="justify">
    	<h2>About Us</h2>
        <p>VISION : Be an excellent public education agency in College Management.</p>
        <p>MISSION : Developing human capital in line with the National Education Philosophy.</p>
        <p>OBJECTIVE :Providing safe, comfortable and well-balanced accommodation facilities, meeting university standards and quality.

		The Student and Student Residence College is divided into five building blocks, For the building blocks of male students namely Tun Sri Lanang A and Tun Sri Lanang B, Both blocks of this building can accommodate a total of 1008 students.
		For female students Residential Colleges, there are 3 blocks, namely Tun Gemala A, Tun Gemala B and Tun Gemala C, all of these blocks are able to accommodate 1500 occupants.</p>
        
        <p><i>We hope you enjoy your stay with us!</i><br><br> </p>
    </div>
    <div class="column">
    	<h2>Contact Us</h2>
        <p>Phone: 06-264 5000<br>
        Address: Jalan Lembah Kesang 1/1-2, Kampung Seri Mendapat, 77300 Merlimau, Melaka<br>
        E-mail : uitmJasin.info@gmail.com<br>
        </p>
    </div>
    
</div>
</div>

<br>

        

<br><br><br><br>
<center>
<div class="footer">
<p>© Copyright UiTM CAMPUS JASIN 2018.
</p>
</div>
</center>

</font>
</body>
</html>