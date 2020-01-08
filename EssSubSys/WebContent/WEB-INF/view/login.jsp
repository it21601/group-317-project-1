<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html lang="el">
<!-- HEADER -->
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="155–160 characters">
<meta name="author" content="George Andrikopoulos, Thanos Arapakis">
<meta name="generator" content="#">
<meta name="google" content="translate">
<meta http-equiv="refresh" content="60">
<link rel="canonical" href="https://www.huassignements.gr">
<title>Σύνδεση</title>

<!-- CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<!--<link rel="stylesheet" type="text/css" href="resources/css/login_style.css"> -->
	<spring:url value="/resources/css/login_style.css" var="login_styleCss" />
	<link href="${login_styleCss}" rel="stylesheet" />
</head>
<body>

<!-- NAVIGATION -->
<nav class="navbar navbar-light fixed-top" style="background-color: #e3f2fd;">
	<a class="navbar-brand" href="#">Χαροκόπειο Πανεπιστήμιο - Σύστημα
		Δήλωσης Εργασιών</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
</nav>

<!-- BODY -->
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
			</div>
			<div class="card-body">
				<form action="student" method="GET">
					<div class="input-group form-group">
						<input type="text" name="username" class="form-control" placeholder="username">
					</div>
					<div class="input-group form-group">
						<input type="password" name="password" class="form-control" placeholder="password">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						<input type="hidden" name="origin" value="login">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Επιθυμείτε να υποβάλετε εργασία; <a href="#">Επικοινωνήστε με τη γραμματεία</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Ξεχάσατε τον κωδικό σας;</a>
				</div>
			</div>
		</div>
	</div>
</div>
<footer class="fixed-bottom" style="background-color: #e3f2fd;"> "Πνευματικά Δικαιώματα" </footer>
</body>

<!--JAVASCRIPT -->

</html>