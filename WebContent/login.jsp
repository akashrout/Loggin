<html>
<head>
<style type="text/css">
/* Bordered form */
form {
   
}

/* Full-width inputs */
input[type=text], input[type=password] { 
    width: 25%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    cursor: pointer;
    width: 25%;
}

/* Add a hover effect for buttons */
button:hover {
    opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
    width: 40%;
}

/* Add padding to containers */
.container {
    padding: 16px;
}
.centerFlex {
  align-items: center;
  display: flex;
  justify-content: center;
}

/* The "Forgot password" text */
span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 100px) {
    span.psw {
        display: block;
        float: none;
    }
    .cancelbtn {
        width: 100%;
    }
}
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
.centered {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -webkit-transform: translate(-50%, -50%);
  -moz-transform: translate(-50%, -50%);
  -o-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -5%);
  
   
  
  
}
.centeredd {
  position: fixed;
  top: 59%;
  left: 46%;
  transform: translate(-50%, -50%);
  -webkit-transform: translate(-50%, -50%);
  -moz-transform: translate(-50%, -50%);
  -o-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -5%);
  
   
  
  
}


.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body background="login.png">
<div class="topnav">
  <a class="active" href="home.jsp">Home</a>
  <a href="index.jsp">sign up</a>
  <a href="login.jsp">login</a>
  <a href="about.jsp">About</a>
  <a href="/LoginAndRegistration/LogoutServlet">Logout</a>
</div>
<form action="/LoginAndRegistration/LoginServlet" method="GET" >
  
  <div class="centered">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" style="width: 300px;"required><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" style="width: 300px" required><br>

    <button type="submit">Login</button>
    <a style="color:red;background-color: yellow" href="index.jsp">Create a free account</a>
    
  <%--   <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label> --%>
 
  
  <%-- <a href="index.jsp">Register</a>	--%>

  
</form>

 </div>
 

</body>
</html>
