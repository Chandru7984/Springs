<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>App to save Ice Cream Information</title>
<style type="text/css">
body {
	background-image:
		url(https://media.timeout.com/images/105661191/image.jpghttps://media.timeout.com/images/105661191/image.jpg);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
}
</style>
</head>
<body>
	</nav>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://a57.foxnews.com/a57.foxnews.com/static.foxnews.com/foxnews.com/content/uploads/2018/09/640/320/1862/1048/5ac46967-ice-cream.jpg?ve=1&tl=1?ve=1&tl=1"
			width="100" height="50" alt="">
		</a> <a class="navbar-brand" href="#" style="font-style: italic;">ARUN'S</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Types & Price </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Candy's</a> <a
							class="dropdown-item" href="#">Orange - 20 Rs</a> <a
							class="dropdown-item" href="#">Mango - 20 Rs</a> <a
							class="dropdown-item" href="#">Grape - 20 Rs</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Cone</a> <a
							class="dropdown-item" href="#">Strawberry - 40 Rs</a> <a
							class="dropdown-item" href="#">Venilla - 40 Rs</a> <a
							class="dropdown-item" href="#">Butterscotch - 45 Rs</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Cup - 10 Rs</a> <a
							class="dropdown-item" href="#">Kulfi - 15 Rs</a> <a
							class="dropdown-item" href="#">Softy - 20 Rs</a> <a
							class="dropdown-item" href="#">Fried Ice - 50 Rs</a> <a
							class="dropdown-item" href="#">Mochi - 50 Rs</a> <a
							class="dropdown-item" href="#">Rocky Road -80 Rs</a> <a
							class="dropdown-item" href="#">Peanut Butter - 70 Rs</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search Stocks" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<br>
	<h1 class="text-danger">Ice Cream Billing</h1>
	<p style="color: green; font-weight: bolder;font-style: italic;font-size: x-large;text-align: center;text-decoration: underline;">${message }</p>
	<p style="color: red; font-weight: bolder;font-style: italic;font-size: x-large;text-align: center;text-decoration: underline;">${error }</p>
	
	<br>
	<form action="send" method="post">
		<pre>
<div style="color: black; font-style: italic; font-weight: bold;">
Type: <input type="text" name="type" />
</div>
<div style="color: black; font-style: italic; font-weight: bold;">
Brand: <input type="text" name="brand" />
</div>
<div style="color: black; font-style: italic; font-weight: bold;">
Flavour: <input type="text" name="flavour" />
</div>
<div style="color: black; font-style: italic; font-weight: bold;">
Price: <input type="text" name="price" />
</div>
<div style="color: black; font-style: italic; font-weight: bold;">
Quantity: <input type="text" name="quantity" />
</div>

</pre>


		<input type="submit" value="send" class="btn btn-success">


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
