<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page</title>
Order placed Successfully
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
</head>
<body>

<table>
<form action="home.jsp" method=post>
<tr>
<td><input type="submit" value="HOME"></td>
</tr>
</form>
<form action="logout.jsp" method=post>
<tr>
<td><input type="submit" value="LOGOUT"></td>
</tr>
</form>
<tr>
<td><input type="submit" value="Cancel Order"></td>
</tr>
</table>

</body>
</html>