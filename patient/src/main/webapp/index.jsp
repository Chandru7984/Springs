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
<title>App to Save Patient Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}

 body {
	background-image:
		url(https://images.pexels.com/photos/13334106/pexels-photo-13334106.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
} 

.login-box {
	position: absolute;
	top: 50%;
	left: 28%;
	width: 400px;
	padding: 50px;
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
	left: 20%;
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
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="border-radius: 20px; background: yellow;"><a href="search.jsp">Search</a></button>
			</form>
		</div>
	</nav>

	<h1>Patient Details</h1>

	<br>

	<p
		style="color: green; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 16%; width: 400px;">${message }</p>
	<p
		style="color: red; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 14%; left: 50%; width: 400px;">${error }</p>

	<form action="save" method="post">
		<div class="login-box">
			
Name: 		<input type="text" name="name" value="${dto.name}" />
<br>
<br>
Email: 		<input type="text" name="email" value="${dto.email}"/>
<br>
<br>
Age: 		<input type="text" name="age" value="${dto.age}"/>
<br>
<br>
Mobile No:  <input type="text" name="mobileNo" value="${dto.mobileNo}"/>
<br>
<br>
Gender: 	
			<input type="radio" id="Male" name="gender" value="Male">
			<label for="Male">Male:</label>
			<input type="radio" id="Female" name="gender" value="Female">
			<label for="Female">Female</label>
			<input type="radio" id="Others" name="gender" value="Others">
			<label for="Others">Others</label>
			<br>
			<br>
Id Proof: 	<select name="idProof">
		    <option>---Select---</option>
		    <option value="Adhaar Card">Adhaar Card</option>
		    <option value="PAN Card">PAN Card</option>
		    <option value="Ration CArd">Ration CArd</option>
		    <option value="Voter ID">Voter ID</option>
		    <option value="DL">DL</option>
		  	</select>
		  	<br>
		  	<br>
Id Value: 	<input type="text" name="idValue" value="${dto.idValue}"/>
<br>
<br>
BPL Card: 	
			<input type="radio" id="Yes" name="bplCard" value="Yes">
			<label for="Yes">Yes</label>
			<input type="radio" id="No" name="bplCard" value="No">
			<label for="No">No</label>	
<br>	
Insurance:  
			<input type="radio" id="Yes" name="insurance" value="Yes">
			<label for="Yes">Yes</label>
			<input type="radio" id="No" name="insurance" value="No">
			<label for="No">No</label>
<br>
			<input type="submit" value="save" class="btn btn-success">
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