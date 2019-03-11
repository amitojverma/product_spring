<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<form action="login.html" method = "post">
  <div class="imgcontainer">
  
  </div>

  <div class="container">
    <label for="userName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>
	<br>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
<br>
    <button type="submit">Submit</button>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Reset</button>
  </div>
</form>
</html>