<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menu.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>List Registration</title>
</head>
<body>
 <a href="viewleadpage">create_newlead</a>
<h2>List Registrations</h2>
<form action="" method="post">
<table border="1">
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
</tr>
<c:forEach var="leads" items="${leads}">
<tr>
<td>${leads.id}</td>
<th><a href="viewlead?id=${leads.id}">${leads.firstName}</a></th>
<th>${leads.lastName}</th>
<th>${leads.email}</th>
<th>${leads.mobile}</th>
<th>${leads.source}</th>
</tr>

</c:forEach>
</table>

</form>
</body>
</html>