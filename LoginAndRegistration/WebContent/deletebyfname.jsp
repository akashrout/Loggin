<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body background ="home.jpg">
<h1>Enter the FastName Which tou want to delete</h1>
<form action="/LoginAndRegistration/DeleteByFastNameServlet" method="GET">
<input type="text" name="fname">
<input type="submit" value="submit">

</form>
</body>
</html>