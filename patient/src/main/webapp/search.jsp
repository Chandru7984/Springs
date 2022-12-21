<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

/* body {
	background-image:
		url(https://mir-s3-cdn-cf.behance.net/project_modules/fs/9ab2be112544209.6016c12124c18.jpg);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
} */
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
	left: 40%;
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

.tab {
	position: absolute;
	left: 25%;
	top: 50%;
}

.tech{
	position: absolute;
	left: 15%;
	top: 20%;
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

		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<form class="form-inline my-2 my-lg-0">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
					<a href="index.jsp">Home</a>
				</button>
			</form>
		</div>
	</nav>

	<br>

	<h1>---Search Page---</h1>

	<br>

	<form action="save" method="get" class="form-inline my-2 my-lg-0"
		style="top: 20%; left: 15%;">

		<div class="tech">
			<pre>
					Name: <input type="text" name="name" value="${dto.name}" />
					
					Age: <input type="text" name="age" value="${dto.age}" />
					
					
					<input type="submit" value="Search" class="btn btn-success">
					</pre>
		</div>

		<div class="tab">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Email</th>
						<th scope="col">Age</th>
						<th scope="col">Mobile No</th>
						<th scope="col">Gender</th>
						<th scope="col">Id Proof</th>
						<th scope="col">Id Value</th>
						<th scope="col">BPL Card</th>
						<th scope="col">Insurance</th>				
					</tr>
				</thead>

				<c:forEach items="${list}" var="dto">
					<tbody>
						<tr>
							<td>${dto.id}</td>
							<td>${dto.name}</td>
							<td>${dto.email}</td>
							<td>${dto.age}</td>
							<td>${dto.mobileNo}</td>
							<td>${dto.gender}</td>
							<td>${dto.idProof}</td>
							<td>${dto.idValue}</td>
							<td>${dto.bplCard}</td>
							<td>${dto.insurance}</td>
						</tr>
					</tbody>
				</c:forEach>

			</table>

		</div>

	</form>

	<p style="text-align: center; color: green;">${message}</p>


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