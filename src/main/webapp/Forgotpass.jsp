<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change you password</title>
<style>
body {
  background-image:url("C:\Users\lenovo\Downloads\Ecart.jpg");
  background-color: pink;
}
h1
{
font-size:70px;
text-shadow: 1px 1px 1px red, 
               5px 5px 7px yellow; 
 }             
</style>
<center>
<h1>BUY-COM</h1>
</center>
<h2>change your password</h2>
</head>
<body>
<table>
<form action="ChangePass" method="post">
<tr><td>User Name:</td><td><input type="text" name="uname"></td></tr>
<tr><td>New Password:</td><td><input type="password" name="pass1"></td></tr>
<tr><td>Confirm Password:</td><td><input type="password" name="pass2"></td></tr>
<tr><td><input type="submit"  value="submit"></td></tr>
</form>
</table>
</body>
</html>