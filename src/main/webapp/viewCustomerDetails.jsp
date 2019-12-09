<%@page import="com.lti.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor= "powderblue">
<%
	Customer c =(Customer) session.getAttribute("customer");
%>
<form name="viewcustomer" action="UpdateCustomer" method="get">
<strong><label>ID: </label></strong><br>
<input type = "text" name="id" value="<%=c.getId() %>" readonly/><br><br>
<strong><label>NAME: </label></strong><br>
<input type="text" name="name" value="<%=c.getName() %>"/><br><br>
<strong><label>CITY: </label></strong><br>
<input type="text" name="city" value="<%=c.getCity() %>"/><br><br>
<strong><label>EMAIL: </label></strong><br>
<input type="text" name="email" value="<%=c.getEmail()%>"/><br><br>
<input type =submit value="Update">
</form>
</body>
</html>