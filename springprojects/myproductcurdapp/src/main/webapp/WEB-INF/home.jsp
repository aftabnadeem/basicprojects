<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@include file="./base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet"  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
<title>PRODUCT CRUD APP</title>


</head>
<body>


<div class="container mt-3">
<div class="container text-right"><a href="adduser" class="btn btn-outline-success"> + ADD USER</a></div>
<table class="table table-striped ">
<thead>
<tr>
<th scope="col">FacultyId</th>
<th scope="col">Facultyname</th>
<th scope="col">Facultydept</th>
<th scope="col">FacultySubject</th>
<th scope="col">Actions</tr>
</thead>
<tbody>
<c:forEach items="${faculty}" var="f">
<tr>
<th scope="row">${f.id }</th>
<td>${f.facname }</td>
<td>${f.facdep }</td>
<td>${f.facsub }</td>
<td>
<a href="update/${f.id }" class="btn btn-outline-info"><i class="fa-solid fa-pen"></i></a>&nbsp;&nbsp;<a href="delete/${f.id}" class="btn btn-outline-danger"><i class="fa-solid fa-trash"></i></a>
</td>
</tr>
</c:forEach>


</tbody>
</table>
</div>
</body>
</html>