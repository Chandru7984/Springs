<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>App to Save Oyo Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}

body {
	background-image:
		url(https://images.oyoroomscdn.com/uploads/hotel_image/73963/8c458e09e571be8e.JPG);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
}

.login-box {
	position: absolute;
	top: 60%;
	left: 70%;
	width: 550px;
	padding: 10px;
	transform: translate(-30%, -45%);
	background: teal;
	box-shadow: 0 15px 25px rgba(140, 120, 230, 0.6);
	border-radius: 10px;
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
	top: 8%;
	left: 70%;
	width: 400px;
	text-align: left;
	font-weight: bold;
	font-style: italic;
	color: black;
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
<title>App to Save Oyo Details</title>
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
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Rooms & Price </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Non-AC - 600</a> <a
							class="dropdown-item" href="#">AC - 1000</a> <a
							class="dropdown-item" href="#">Deluxe - 1500</a>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<h1>Oyo Details</h1>

	<br>

	<p
		style="color: green; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 65%; width: 400px;">${message }</p>
	<p
		style="color: red; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 65%; width: 400px;">${error }</p>

	<form action="send" method="post">
		<div class="login-box">
			<pre>
Location: <input type="text" name="location" value="${dto.location }" />

State: <input type="text" name="state" value="${dto.state }" />

Customer Name: <input type="text" name="customerName"
					value="${dto.customerName }" />

Age: <input type="text" name="age" value="${dto.age}">

Fees: <input type="text" name="fees" value="${dto.fees}">

Pincode: <input type="text" name="pincode" value="${dto.pincode}"> 

Contact No: <input type="text" name="contactNo" value="${dto.contactNo}"> 

No Of Rooms: <input type="text" name="noOfRooms"
					value="${dto.noOfRooms}"> 

AC: <input type="text" name="ac" value="${dto.ac}">

Non Ac: <input type="text" name="nonAc" value="${dto.nonAc}"> 

</pre>


			<input type="submit" value="send" class="btn btn-success">


		</div>

	</form>

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