<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<spring:url value="/resources/css/essay_view_style.css"
	var="essay_view_styleCss" />
<link href="${essay_view_styleCss}" rel="stylesheet" />
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
					<h3>Εργασία: ${details.title}</h3>
					<h4 class="mr-sm-2">Ημερομηνία Έκδοσης: ${details.pubDate}</h4>
				</div>
				<div class="card-body">
					<p>${details.desc}</p>
					<p>Προαπαιτούμενα: ${details.requirements}</p>
				</div>
				<form action="submission" method="GET">
					<div class="card-footer">
						<p>Λέξεις Κλειδιά: ${details.keywords}</p>
						<input name="title" type="hidden" value="${details.title}">
						<input name="date" type="hidden" value="${details.pubDate}">
						<input name="submit" type="submit" value="Αποστολή Αιτήματος"
							onclick="location.href='submission'"
							class="btn btn-primary float-right submit_btn">
						<button type="button" name="back" onclick="history.back()" class="btn btn-primary float-left submit_btn">Επιστροφή στη Λίστα</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>