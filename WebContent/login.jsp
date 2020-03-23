<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Login page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
</style>
</head>
<body style="background-color:#f2f2f2;">

<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">

    	<div class="container">
    <a href="./landing.jsp" class="w3-bar-item w3-button w3-theme-l1">WebApp</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Login</a>
    <a href="./register.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Register</a>
</div>
  </div>
</div>
<div class="container">
 <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Login</h1>        
    <hr/>   
    <!-- Login Form with validation -->
    <form action="./LoginServlet" method="post">  
    <input type="text" name="email" size="33" placeholder="Email / Account Name" required><br/><br/>  
    <input type="password" name="password" size="33" placeholder="Password" required><br/><br/>  
    <input type="submit" value="Login">  
    </form>  
    </div>
  </div>
</div>
  <nav class="navbar fixed-bottom navbar-dark bg-secondary text-white">
    <div class="container">2020 © Alex McCall</div>
  </nav>

</body>

</html>