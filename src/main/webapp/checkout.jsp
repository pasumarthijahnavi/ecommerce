<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>checkout page</title>
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
<h2>PAYMENT METHOD</h2>
</head>
<body>
<table cellpadding="5" cellspacing="5">
<form action="Last.jsp" method="post">
  <tr><td> <input type="radio" name="choice" value="Yes"> CARD</td></tr>
 <tr><td>  <input type="radio" name="choice" value="Yes"> E-PAY</td></tr>
 <tr><td>  <input type="radio" name="choice" value="Yes">BUYTM</td></tr>
 <tr><td><input type="submit" value="PAY"></td></tr>
</form>

<td></td>


</body>
</html>