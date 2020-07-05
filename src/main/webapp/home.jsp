<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to home page</title>
<style>
body {
  background-image:url("C:\Users\lenovo\Downloads\Ecart.jpg");
  background-color: pink;
}
</style>
<%!
String u;
%>
<%
u=(String)session.getAttribute("name1");
 %>
<h1 style="color:red">Welcome to BUY-COM  <%=u %></h1>
<h3 style="color:red"><a style="color:blue" href="viewproducts.jsp">Tap to View The products</a></h3>
<img alt="please wait" src="C:\Users\lenovo\Downloads\Ecart.jpg"></img>
</head>
<body >

</body>
</html>