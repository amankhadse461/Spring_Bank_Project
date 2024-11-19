<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<style>
body {
	background-color: black;
	color: white;
	font-family: "Times New Roman", Times, serif;
}

label {
	background-color: black;
	color: white;
}

input {
	background-color: black;
	color: white;
}

div {
	background-color: black;
	color: white;
	padding-left: 500px;
	padding-right: 600px;
}

select {
	background-color: black;
	color: white;
}

option {
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<h3 style="text-align: center; padding-right: 90px">Register</h3>
	<br>
	<form action="register">
		<div class="mb-3">
			<label class="form-label">Enter Account Number </label> <input
				type="number" name="accountno" class="form-control" maxlength="8	"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter Name </label> <input type="text"
				name="name" class="form-control"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter Mobile-Number </label> <input
				type="number" name="mobno" class="form-control"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter Aadhar-Number </label> <input
				type="number" name="aadharno" class="form-control"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			Male <input type="radio" name="gender" value="male"
				style="background-color: black; color: white;"> Female <input
				type="radio" name="gender" value="female"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			English <input type="checkbox" name="langauge" value="english"
				style="background-color: black; color: white;"> Marathi <input
				type="checkbox" name="langauge" value="marathi"
				style="background-color: black; color: white;"> Hindi <input
				type="checkbox" name="langauge" value="hindi"
				style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			<select name="city">cities
				<option value="pune">Pune</option>
				<option value="nagpur">Nagpur</option>
				<option value="mumbai">Mumbai</option>
				<option value="up">UP</option>
			</select>
		</div>
		<div class="mb-3">
			<label class="form-label">Enter Age </label> <input type="number"
				name="age" class="form-control"
				style="background-color: black; color: white;">
		</div>

		<div class="mb-3">
			<label class="form-label">Enter Password</label> <input
				type="password" name="password" class="form-control"
				style="background-color: black; color: white;"> <br>
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	</form>
</body>
</html>