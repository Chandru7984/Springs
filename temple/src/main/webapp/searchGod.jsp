<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>App to save Temple Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}

.result {
	position: absolute;
	top: 40%;
	left: 24%;
	padding: 30px;
}

footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: white;
	color: black;
	text-align: center;
}

body {
	background-image:
		url(https://images.pexels.com/photos/11305767/pexels-photo-11305767.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
}

form {
	text-align: center;
}

pre {
	color: black;
	font-size: large;
	font-style: italic;
	font-weight: bold;
}

h1 {
	position: absolute;
	top: 10%;
	left: 40%;
	width: 400px;
	text-align: left;
	font-weight: bold;
	font-style: italic;
	color: white;
}

input {
	opacity: 0.8;
}

select {
	opacity: 0.8;
}

a {
	font-style: italic;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo03"
			aria-controls="navbarTogglerDemo03" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="#">Home</a>

		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="#">About
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Purohit's </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Venkatesh</a> <a
							class="dropdown-item" href="#">Krishnamurthy</a> <a
							class="dropdown-item" href="#">Anil</a> <a class="dropdown-item"
							href="#">Sudarshan</a>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	
	<h1>Result Found</h1>
	<br>

	<div class="result">
<pre>

<table class="table table-striped table-dark">
<thead>
<tr>
<th scope="col">Name</th>
<th scope="col">Location</th>
<th scope="col">Main God</th>
<th scope="col">Pincode</th>
<th scope="col">Fees</th>
<th scope="col">Open Time</th>
<th scope="col">Close Time</th>
</tr>
</thead>

<c:forEach items="${dto}" var="god">
      <tr>
          <td>${god.name}</td>
          <td>${god.location}</td>
          <td>${god.mainGod}</td>
          <td>${god.pincode}</td>
          <td>${god.fees}</td>
          <td>${god.openTime}</td>
          <td>${god.closeTime}</td>
      </tr>
    </c:forEach>

</table>
</pre>
</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>