<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>

Customer:<br>
First Name:
${customer.firstName} 
<br>

Last Name:
${customer.lastName}
<br>
Free Passes:
${customer.freePasses}
<br>
Postal Code:
${customer.postalCode}
<br>
Course Code:
${customer.courseCode}

</body>
</html>