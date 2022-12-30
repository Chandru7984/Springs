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
<title>App to Save Criminal Details</title>
<style type="text/css">
a {
	text-align: left;
	color: black;
}

 /* body {
	background-image:
		url(https://images.pexels.com/photos/13334106/pexels-photo-13334106.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load);
	background-repeat: no-repeat;
	background-size: 100%;
	text-align: center;
}  */

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

/* .saved details {
	position: absolute;
	top: 56%;
	left: 28%;
	width: 350px;
	padding: 30px;
	transform: translate(-45%, -45%);
	background: teal;
	box-shadow: 0 15px 25px rgba(140, 120, 230, 0.6);
	border-radius: 10px;
} */

.tab {
	position: absolute;
	left: 17%;
	top: 60%;
}

.tech{
	position: absolute;
	left: 12%;
	top: 27%;
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
	
	<p
		style="color: green; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 37%; width: 400px;">${message }</p>
	<p
		style="color: red; font-weight: bolder; font-style: italic; font-size: x-large; text-align: center; text-decoration: underline; position: absolute; top: 15%; left: 37%; width: 400px;">${error }</p>

	<br>
	
	<form action="crime" method="get" class="form-inline my-2 my-lg-0"
		style="top: 20%; left: 15%;">

		<div class="tech">
			<pre>
					Name: <input type="text" name="name" value="${dto.name}" />
					
			         Jail Name: <input type="text" name="jailName" value="${dto.jailName}" />
					
					
					<input type="submit" value="Search" class="btn btn-success">
					</pre>
		</div>

		<div class="tab">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Image</th>
						<th scope="col">Crime</th>
						<th scope="col">Alias Name</th>
						<th scope="col">Jail Name</th>
						<th scope="col">Description</th>
						<th scope="col">Created By</th>
						<th scope="col">Created Date</th>
						<th scope="col">File Name</th>
						<th scope="col">File Size</th>
						<th scope="col">Content Type</th>
					</tr>
				</thead>

				<c:forEach items="${list}" var="dto">
					<tbody>
						<tr>
							<td>${dto.id}</td>
							<td>${dto.name}</td>
							<td><img alt="Image" src="crime/files/${dto.fileName}" width="100" height="120"> </td>
							<td>${dto.crime}</td>
							<td>${dto.aliasName}</td>
							<td>${dto.jailName}</td>
							<td>${dto.description}</td>
							<td>${dto.createdBy}</td>
							<td>${dto.createdDate}</td>
							<td>${dto.fileName}</td>
							<td>${dto.fileSize}</td>
							<td>${dto.contentType}</td>
						</tr>
					</tbody>
				</c:forEach>

			</table>

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