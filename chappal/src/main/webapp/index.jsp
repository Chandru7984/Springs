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
<title>App to Save Chappal Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}

body {
	background-image:
		url(https://mir-s3-cdn-cf.behance.net/project_modules/fs/9ab2be112544209.6016c12124c18.jpg);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
}

.login-box {
	position: absolute;
	top: 56%;
	left: 28%;
	width: 350px;
	padding: 30px;
	transform: translate(-45%, -45%);
	background: teal;
	box-shadow: 0 15px 25px rgba(140, 120, 230, 0.6);
	border-radius: 10px;
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
	left: 19%;
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
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Brand's </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Nike</a> <a
							class="dropdown-item" href="#">Puma</a> <a class="dropdown-item"
							href="#">Addidas</a> <a class="dropdown-item" href="#">HRX</a>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<h1>Chappal Details</h1>

	<br>

	<p
		style="color: green; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 16%; width: 400px;">${message }</p>
	<p
		style="color: red; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 14%; left: 17%; width: 400px;">${error }</p>

	<form action="send" method="post">
		<div class="login-box">
			<pre>
Brand: <input type="text" name="brand" />

Price: <input type="text" name="price" />

Color: <select name="color">
        <option value="0">--SELECT--</option>
        <option value="Red">Red</option>
        <option value="Green">Green</option>
        <option value="Black">Black</option>
        <option value="White">White</option>
        <option value="Pink">Pink</option>
        <option value="Yellow">Yellow</option>
        <option value="Orange">Orange</option>
</select>

Size: <select name="size">
<option value="0">--SELECT--</option>
        <option value="3">3</option>
        <option value="3.5">3.5</option>
        <option value="4">4</option>
        <option value="4.5">4.5</option>
        <option value="5">5</option>
        <option value="5.5">5.5</option>
        <option value="6">6</option>
        <option value="6.5">6.5</option>
        <option value="7">7</option>
        <option value="7.5">7.5</option>
        <option value="8">8</option>
        <option value="8.5">8.5</option>
        <option value="8.5">9</option>
</select>

Gender: <input type="radio" name="gender">Male
		<input type="radio" name="gender">Female
		<input type="radio" name="gender">Others
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

	<footer>
		<p>
			Created By: Chandrashekhar A S <br> <a
				href="chandrashekhar.xworkz@gmail.com">chandrashekhar.xworkz@gmail.com</a>
		</p>
	</footer>
</body>
</html>