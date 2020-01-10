<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "f" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html lang="el">
<!-- HEADER -->
<head>
<!-- METADATA -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="155–160 characters">
<meta name="author" content="George Andrikopoulos, Thanos Arapakis">
<meta name="generator" content="#">
<meta name="google" content="translate">
<meta http-equiv="refresh" content="60">

<link rel="canonical" href="https://www.huassignements.gr">
<title>Σύστημα Δήλωσης Εργασιών</title>

<!-- CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<spring:url value="/resources/css/student_menu_style.css"
	var="student_menu_styleCss" />
<link href="${student_menu_styleCss}" rel="stylesheet" />
</head>

<body>
	<!-- NAVIGATION -->
	<nav class="navbar navbar-light fixed-top"
		style="background-color: #e3f2fd;">
		<a class="navbar-brand" href="#">Χαροκόπειο Πανεπιστήμιο - Σύστημα
			Δήλωσης Εργασιών<small>Κάλως ήρθες, ${first_name}</small>
		</a>
		<form class="form-inline">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</nav>
	<!-- BODY -->
	<div class="container">
		<div class="d-flex justify-content-center">
			<div class="card">
				<div class="card-header">
					<h3>Λίστα Εργασιών</h3>
				</div>
				<div class="card-body">
					<form action="student/essay" method="GET">
						<ul class="list-group">
							<c:forEach items="${essays}" var="e">
								<input name="title" type="submit" value="${e.title}"
									onclick="location.href='student/essay'"
									class="list-group-item list-group-item-action">
							</c:forEach>
						</ul>
					</form>
				</div>
				<div class="card-footer">
				</div>
			</div>
		</div>
	</div>
	<!-- FOOTER -->
	<footer class="fixed-bottom navbar navbar-light"
		style="background-color: #e3f2fd;">
		<div class="d-flex justify-content-left links">
			<a href="#">Αρχική</a> //
			<a href="#">Επικοινωνία</a> //
			<a href="#">Σχετικοί Σύνδεσμοι</a> // 
			<a href="#">Όροι Χρήσης</a> // 
			<a href="#">Οδηγίες Χρήσης</a>
		</div>
		Σύστημα Δήλωσης Εργασιών © Copyright 2020 Χαροκόπειο Πανεπιστήμιο
	</footer>
</body>
</html>