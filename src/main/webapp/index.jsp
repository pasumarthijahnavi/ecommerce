<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
 
  background-color: pink;
}
h1
{
font-size:70px;
text-shadow: 1px 1px 1px red, 
               5px 5px 7px yellow; 
 }             
</style>
<meta charset="ISO-8859-1">
<title>Welcome to BUY-COM</title>
<center>
<h1>BUY-COM</h1>
</center>
<h2 style="color:red">LOGIN PAGE</h2>
</head>
<body>
<form  action="Validation"  method="post">
<table>
<img alt="please wait" src="C:\Users\lenovo\Downloads\Ecart.jpg"></img>
<tr><td>User Name:</td><td><input type="text" name="uname"></td></tr>
<tr><td>Password:</td><td><input type="password" name="pass"></td></tr>
<tr><td><input type="submit"  value="submit"></td><td><a style="color:red" href="Forgotpass.jsp?">Forgot Password?</a></td></tr>
<tr class="blank_row">
</tr>
<tr><td></td></tr>
<tr><td>NEW USER?</td><td>...Click below</td></tr>
<tr><td ><a style="color:red" href="registration.jsp">Please Sign Up :)</a></td></tr>
</table>
</form>
</body>
</html>
