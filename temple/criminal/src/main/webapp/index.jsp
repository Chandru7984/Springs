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
<title>App to Save Criminal Details</title>
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

.card-registration .select-input.form-control[readonly]:not([disabled]) {
font-size: 1rem;
line-height: 2.15;
padding-left: .75em;
padding-right: .75em;
}
.card-registration .select-arrow {
top: 13px;
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
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="border-radius: 20px; background: green;"><a href="search.jsp">Search</a></button>
			</form>
		</div>
	</nav>

	<section class="h-100 bg-dark">
  <div class="container py-5 h-80">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-6">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img src="https://media.istockphoto.com/id/1143736474/photo/dark-web-hooded-hacker.jpg?b=1&s=170667a&w=0&k=20&c=HxuZ18KLim_SMYUMBQqIDvl73ASTKlCdp_nDwIZA0Io="
                alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">---Criminal Details---</h3>
                
               <form action="crime" method="post" enctype="multipart/form-data">

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="name" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m">Name</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="crime" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1n">Crime</label>
                    </div>
                  </div>
                </div>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="aliasName" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m1">Alias Name</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="jailName" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1n1">Jail Name</label>
                    </div>
                  </div>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" name="description" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example8">Description</label>
                </div>
                
                <label >File</label>
		<input type="file" name="file">
                
                <br>
                
                <input type="submit" value="send" class="btn btn-success">
                
                </form> 

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

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