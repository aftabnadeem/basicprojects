<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@include file="./base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="/myproductcurdapp/updated">
&nbsp;&nbsp;&nbsp;&nbsp;<label>ENTER YOUR NAME :  </label>&nbsp;&nbsp;<input type="text" name="facname" value="${name }"/><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;<label>ENTER ID : </label> <input type="text" name="id" value="${id }"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;<label>ENTER COURSE : </label> <input type="text" name="facdep" value="${dept }"/><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;<label>ENTER SUBJECT :</label><input type="text" name="facsub" value="${sub }"><br><br>
<button type="submit" class="btn btn-info">UPDATE</button>
</form>


</body>
</html>