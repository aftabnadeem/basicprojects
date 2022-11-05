<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Update Product</title>

<style>
body{
background:linear-gradient(#BB1900,#FD6F01,#FFB000);
}
form{

background-color:white;

border-radius:15px;
padding:40px;
width:40%
}
</style>
</head>
<body>
<br><br>
<h1 align="center">Update Details</h1><br><br>
<div class="container" align="center">
<form action="${pageContext.request.contextPath }/added">

<div class="form-group">
<label>Product ID</label>
<input type="text" name="id" class="form-control" value="${product.id }"/>
</div>
<div class="form-group">
<label>Update Product Name</label>
<input type="text" name="productname" class="form-control" value="${product.productname }"/>
</div>
<div class="form-group">
<label>Update Product Description</label>
<input type="text" name="productdescription" class="form-control" value="${product.productdescription }"/>
</div>
<div class="form-group">
<label>Product Price</label>
<input type="text" name="productprice" class="form-control" value="${product.productprice }"/>
</div>
<br>
<button type="submit"class="btn btn-warning btn-block">Update</button>
<br>
</form>
</div>
</body>
</html>