<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="../css/home.css" type="text/css">
<script>
function commingSoon() {
	alert("Comming Soon!!!");
}
</script>
</head>
<body>
  <div class="head">
  <h class="brand">Daily Paper</h>
  <a href="login" onclick="return alert('Successfully loged out!!!')">logout</a>
  </div>
  <div class="module">
  <div>
  <a href="" > @ Add Subscription</a>
  </div>
  <div><a href="home" onclick=commingSoon()>Subscription History</a> </div>
  <div><a href="home" onclick=commingSoon()>Profile</a></div>
  </div>
</body>
</html>