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
<title>view your products</title>
<center>
<h1>BUY-COM</h1>
</center>
</head>
<body>



<table cellpadding="5" cellspacing="5">

<tr> 
<th>Product id</th> <td></td> 
<th>product-Name</th> 
<th>Price</th> 
<th>ADD-to-CART</th>
</tr>
<%

try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	 	
PreparedStatement pst=con.prepareStatement("SELECT * from products");
ResultSet rs = pst.executeQuery();


%>

<% while(rs.next()) { %>
	<tr>
<form action="AddPro" method="post">
<input type="hidden" name="productid" value="<%=rs.getInt("productid")%>"/>
<td>--> <%=rs.getInt("productid")%></td> <td></td>
<td><%= rs.getString("productname")%></td>
<td><%= rs.getInt("price")%></td>
<td><input type="submit"  value="Add to Cart" ></td>
</form>
</tr>
	<%
	} 
	 
	con.close();
}
catch(Exception e)
{
	e.printStackTrace();
}%>
</table>


<form action="checkcart.jsp" method="post">
<input type="submit" value="Check Cart">


</form>

</body>
</html>