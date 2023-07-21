<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Registration</title>
</head>
<body>
<h2>Create lead| Lead Registration</h2>
<form action="savelead" method="post">
<pre>
firstName <input type="text" name="firstName"/>
lastName <input type="text" name="lastName"/>
Email <input type="email" name="email"/>
mobile <input type="text" name="mobile"/>
Source :
             <select name="source" >
           <option value="radio">radio</option>
           <option value="newspaper">newspaper</option>
           <option value="trade show">trade show</option>
           <option value="online">online</option>
           </select>
           
 <input type="submit" value="save"/>          
</pre>
</form>
${msg}
</body>
</html>