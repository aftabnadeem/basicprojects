<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updated">
driverid=<input type="text" name="driverid" value="${driver.driverid }"/><br>
drivername=<input type="text" name="drivername" value="${driver.drivername }"/><br>
driverclass=<input type="text" name="driverclass" value="${driver.driverclass }"/><br>
<button type="submit">update</button>
</form>
</body>
</html>