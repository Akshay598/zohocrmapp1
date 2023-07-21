<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact Registration</title>
</head>
<body>
<h2>contact Registrations</h2>
<form action="" method="post">
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
</tr>
<c:forEach var="contacts" items="${contacts}">
<tr>
<th>${contacts.firstName}</th>
<th>${contacts.lastName}</th>
<th>${contacts.email}</th>
<th>${contacts.mobile}</th>
<th>${contacts.source}</th>
</tr>

</c:forEach>
</table>

</form>
</body>
</html>