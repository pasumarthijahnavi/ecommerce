<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
  background-image:url("C:\Users\lenovo\Downloads\Ecart.jpg");
  background-color: pink;
}
</style>
<title>Registration form</title>
<h1 style="color:red">Please enetr your details</h1>
</head>
<body>
<form action="Registration" method="post">
<table>
<tr><td>Name:</td><td><input type="text" name="fullname"></td></tr>
<tr><td>User Name:</td><td><input type="text" name="uname"></td></tr>
<tr><td>Password:</td><td><input type="password" name="pass"></td></tr>
<tr><td>Confirm Password:</td><td><input type="password" name="cpass" onblur="cval();"></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr> <td><input type="submit"  value="submit"></td></tr>
</table>
</form>
</body>
</html>