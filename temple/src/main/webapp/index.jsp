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
<title>App to save Temple Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}
body {
	background-image:
		url(https://wallpapertag.com/wallpaper/full/e/5/7/707589-wallpapers-of-himalayas-2560x1600-tablet.jpg);
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
	text-align :center;
	font-weight: bold;
	font-style: italic;
	color: maroon;
}
input {
	opacity:0.8;
}
select{
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

	<h1>Temple Details</h1>

	<br>

	<p
		style="color: blue; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline;">${message }</p>
	<p
		style="color: red; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline;">${error }</p>

	<br>
	<form action="save" method="post">
		<pre>
Name: <input type="text" name="name" />
<br>
Location: <select name="location">
<option>---Location---</option>
<option value="Basavanagudi">Basavanagudi</option>
<option value="Jayanagar">Jayanagar</option>
<option value="BTM">BTM</option>
<option value="Banashankari">Banashankari</option>
<option value="HSR">HSR</option>
</select>
<br>
Main God: <select name="mainGod">
<option>---Choose---</option>
<option value="Basavanagudi">Bull Temple</option>
<option value="Jayanagar">Raghavendra</option>
<option value="BTM">Shiva Temple</option>
<option value="Banashankari">Banashankari Devi</option>
<option value="HSR">Anjaneya</option>
</select>
<br>
Pincode: <select name="pincode">
    <option>---Choose---</option>
    <option value="560004">560004</option>
    <option value="560026">560026</option>
    <option value="560035">560035</option>
    <option value="560008">560008</option>
    <option value="560028">560028</option>
  </select>
  <br>
Fees: <input type="text" name="fees" />
<br>
Open Time: <input type="text" name="openTime" />
<br>
Close Time: <input type="text" name="closeTime" />
</pre>


		<input type="submit" value="save" class="btn btn-success">


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