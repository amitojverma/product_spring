<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<form action="action_page.php">
  <div class="imgcontainer">
  
  </div>

  <div class="container">
    <label for="uname"><b>Enter product Id</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>
	<br>
    <label for="psw"><b>Enter Product Name</b></label>
    <input type="text" placeholder="Enter Name" name="productName" required>
<br>
<label for="psw"><b>Enter Product Quantity</b></label>
    <input type="text" placeholder="Enter Quantity" name="quantity" required>
<br>
<label for="psw"><b>Enter Product Price</b></label>
    <input type="text" placeholder="Enter Price" name="price" required>
<br>
    <button type="submit">Submit</button>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Reset</button>
  </div>
</form>
</html>