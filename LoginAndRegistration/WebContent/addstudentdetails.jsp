<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTER</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>  
function validateform(){  
var fname=document.myform.fname.value;  
var password=document.myform.pass.value;  
  
if (fname==null || fname.length>15){  
  alert("Fast Name can't be blank or more than 15");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
</script> 
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 10px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

button:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
<script>
function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
}
</script>
</style>
</style>
</head>
<body background="home.jpg">
<h1>Enter new Student Details</h1>
<div class="topnav">
  <a class="active" href="home.jsp">Home</a>
  <a href="index.jsp">sign up</a>
  <a href="login.jsp">login</a>
  <a href="about.jsp">About</a>
  <a href="/LoginAndRegistration/LogoutServlet">Logout</a>
</div>

<form  action="/LoginAndRegistration/DataInsertServlet" onsubmit="return validateform() style="border:1px solid #ccc" method="GET">
  <div class="container">
   
    <hr>
	
	<label for="id"><b>Id</b></label>
    <input type="text" placeholder="Enter id" name="id" required>
    
	
	<label for="fastname"><b>First Name</b></label>
    <input type="text" placeholder="Enter Fast Name" name="fname" required>
	
	<label for="lastname"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="lname" required>

    <label for=Rollno><b>Roll Number</b></label>
    <input type="text" placeholder="Enter Roll Number" name="rollno" required>
	
	<label for="branch"><b>Branch</b></label>
    <input type="text" placeholder="Enter Branch" name="branch" required>

    
    
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      
      <button type="submit" class="signupbtn">Add</button>
      
      
    </div>
  </div>
</form>
<a href="login.html">login</a>
</body>
</html>