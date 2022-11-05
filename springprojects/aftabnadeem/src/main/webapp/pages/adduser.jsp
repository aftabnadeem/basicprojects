<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addproduct</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet"  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
<style>
body{
background:linear-gradient(
    limegreen,
    transparent
  ),
  linear-gradient(
    90deg,
    skyblue,
    transparent
  ),
  linear-gradient(
    -90deg,
    coral,
    transparent
  );
  
background-blend-mode: screen;
}
form{

background-color:white;

border-radius:15px;
padding:40px;
width:40%
}


}

</style>
</head>
<body>
<br><br>
<h1 align="center">Product Details</h1><br><br>
<div class="container" align="center">
<form action="added">

<div class="form-group">
<label>Enter Product ID</label>
<input type="text" name="id" class="form-control"/>
</div>
<div class="form-group">
<label>Enter Product Name</label>
<input type="text" name="productname" class="form-control"/>
</div>
<div class="form-group">
<label>Enter Product Description</label>
<textarea class="form-control" rows="3" name="productdescription"></textarea>
</div>
<div class="form-group">
<label>Product Price</label>
<input type="text" name="productprice" class="form-control"/>
</div>
<br>
<button type="submit"class="btn btn-primary btn-block">Create</button>
<br>
</form>
</div>
</body>
</html>