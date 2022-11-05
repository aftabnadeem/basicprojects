<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@include file="./base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet"  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
<title>Product Crud App</title>
<style>
body{
background:linear-gradient(-120deg,#1E5397,#376DB6,#4CA2DA,#91D8F4);
}
table{
border: 0.5px solid white;
}


table tbody{
color:#FFF;


}
table th{
background-color:#094b76;color:#FFF;
}


</style>
</head>
<body>
<br>
<div class="container" align="center"><a href="adduser" class="btn btn-outline-light"><i class="fa-solid fa-plus"></i>&nbsp;ADD</a></div>
<br>
<div class="container">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                              <th scope="col">Id</th>
                                <th scope="col">Product Name</th>
                               
                                <th scope="col">Descrption</th>
                                <th scope="col">Price</th>
                                
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${product}" var="p">
                            <tr>
                                 <td>${p.id }</td>
                                <td>${p.productname }</td>
                               
                                <td>${p.productdescription }</td>
                                <td>${p.productprice }</td>
                                
                                <td>
                                       
                                        <a href="edit/${p.id}" class="btn btn-outline-light"><i class="fa-solid fa-pen"></i></a>&nbsp;&nbsp;&nbsp;<a href="delete/${p.id}" class="btn btn-outline-light" onclick="return confirm('Are sure you want to delete')"><i class="fa-solid fa-trash"></i></a>
                                    
                                </td>
                                </tr>
                                 
                           </c:forEach>
                            </tbody>
                            </table>
                            </div>
                            
                            
</body>
</html>