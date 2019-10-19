<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration form</title>

<style>
.error {color:red}
</style>

</head>
<body>

<i>Fill out the form (*) means required</i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
Fist Name:
<form:input path="firstName" />

Last Name (*):
<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>

		<input type="submit" value="Save" />
	</form:form>

</body>
</html>