<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
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
    width: 33.33%;
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
  <li><a href="homepage.jsp">Home</a></li>
  <li><a href="information.jsp">Information</a></li>

    </div>
   
  </li>
</ul>
</center>

<div class="row">
	<div class="column" align="justify">
    	<h2>College rules</h2>
        <p>1.Compliance and appreciation of the values ​​demanded by Islam.<br>
        	2. The skills and involvement of college dwellers in fulfilling the learning and soft requirements.<br>
        	3.The development of an atmosphere of knowledge, quality improvement, involvement and student skills are integrated into the learning demands<br>
        </p>
       
    </div>
    <div class="column">
    	<h2>Functions of the Unit of the College and NR</h2>
        <p>1.Managing Student and Visitor Placement Facilities<br>
        2.Managing NR Student Welfare<br>
        3.Home College Enrollment<br>
        4.Electrical Appliance Registration<br>
        </p>
    </div>
    <div class="column"> 
     	<h2>Facilities available at the residential College</h2>
        <p>1.Coin-operated machine<br>
        2.TV watching room<br>
        3.Reading room<br>
        4.Computer room<br>
        5.Sick bay<br>
        6.Guest House<br>
        7.Recreational Space<br>
        8.ATM<br>
        </p>
    </div>
</div>

<div class="row">
	<div class="column" align="justify">
    	<h2>College Enrollment Procedure</h2>
        <p>1.Notice the room listing period<br>
        	2.Show copy of offer letter<br>
        	3.Sign up to take Room key<br>
        </p>
       
    </div>
    <div class="column">
    	<h2>College Checkout Procedure</h2>
        <p>1.Duration 2 days after examination<br>
        2.clean the room<br>
        3.Submit form / activity card and room key surrender signature<br>
        </p>
    </div>
    <div class="column"> 
     	<h2>Electrical equipment allowed in residential college</h2>
        <p>1.Laptop<br>
        2.Iron<br>
        3.Hair Dryer<br>
        </p>
    </div>
</div>


</body>
</html>