<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<form action="addProduct.html" method = "post">
  <div class="imgcontainer">
  
  </div>

  <div class="container">
    <label for=productId><b>Enter product Id</b></label>
    <input type="text" placeholder="Enter productId" name="productId" required>
	<br>
    <label for="productName"><b>Enter Product Name</b></label>
    <input type="text" placeholder="Enter productName" name="productName" required>
<br>
<label for="productQuantity"><b>Enter Product Quantity</b></label>
    <input type="text" placeholder="Enter Quantity" name="productQuantity" required>
<br>
<label for="productPrice"><b>Enter Product Price</b></label>
    <input type="text" placeholder="Enter Price" name="productPrice" required>
<br>
    <input type="submit" value = "submit">
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Reset</button>
  </div>
</form>
</html>