<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- profile page rendered upon registration -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
</style>
<body style="background-color:#f2f2f2;">

<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">

    <div class="container">
    <a href="./landing.jsp" class="w3-bar-item w3-button w3-theme-l1">WebApp</a>
</div>
  </div>
</div>
<div class="container">
 <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Profile</h1>
      <h2>Welcome ${user.email} !</h2>
      
      <table>
      <tr><th>Name</th><th></th></tr>
      <tr><td> ${user.fName} ${user.lName}</td><td></td></tr>
      <tr><th>Address</th></tr> 
      <tr><td> ${user.address} ${user.city}, ${user.state} ${user.zip}</td></tr>
      <tr><th>Quote</th></tr>
      <tr><td> ${user.quote} </td></tr>
      </table>
       <a href="landing.jsp">Logout</a>
    </div>
  </div>
</div>
  <nav class="navbar fixed-bottom navbar-dark bg-secondary text-white">
    <div class="container">2020 © Alex McCall</div>
  </nav>

</body>
</html>