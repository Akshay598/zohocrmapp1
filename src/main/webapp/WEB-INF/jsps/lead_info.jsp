<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LeadInfo</title>
</head>
<body>
<h2>leadInfo</h2>
FirstName:${lead.firstName}<br/>
lastName:${lead.lastName}<br/>
Email:${lead.email}<br/>
Mobile:${lead.mobile}<br/>
Source:${lead.source}<br/>

<form action="sendMail" method="post">
 <input type="hidden" name="email" value="${lead.email}">
<input type="submit" value="sendEmail"/>
</form>

<form action="savecontact" method="post">
<input type="hidden" name="id" value="${lead.id}">
<input type="submit" value="convert"/>
</form>
</body>
</html>