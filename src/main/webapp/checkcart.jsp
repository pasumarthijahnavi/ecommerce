<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.ResultSet"%>
    
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart products</title>
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
<h2>Your CART Products</h2>
</head>
<body>
<table cellpadding="5" cellspacing="5">

<tr> 
<th>Product id</th> <td></td> 
<th>product-Name</th> 
<th>Price</th> 
<th>RemoveItem</th>
</tr>
<%

try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	 	
PreparedStatement pst=con.prepareStatement("SELECT * from carttable");
ResultSet rs = pst.executeQuery();


%>

<% while(rs.next()) { %>
	<tr>
<form action="RemovePro" method="post">
<input type="hidden" name="id" value="<%=rs.getInt("identity")%>"/>
<td>--> <%=rs.getInt("productidx")%></td> <td></td>
<td><%= rs.getString("productnamex")%></td>
<td><%= rs.getInt("pricex")%></td>
<td><input type="submit"  value="Remove" ></td>
</form>
</tr>
	<%
	}


PreparedStatement pst1 = con.prepareStatement("SELECT SUM(pricex) from carttable");
ResultSet rs1 = pst1.executeQuery();
 while(rs1.next()) {
%>
<tr>
<td style="color:red">TOTAL PRICE:<%=rs1.getInt(1) %></td>                                                                                                                                                                                                                                                        
</tr>
<% } 

  
	con.close();
}
catch(Exception e)
{
	e.printStackTrace();
}
%>
</table>

<form action="checkout.jsp" method="post">
<input type="submit" value="checkout">

</form>

</body>
</html>