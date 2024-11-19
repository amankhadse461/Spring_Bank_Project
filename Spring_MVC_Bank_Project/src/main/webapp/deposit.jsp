<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
</head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<style>
body {
	background-color: black;
	color: white;
	font-family: "Times New Roman", Times, serif;
	
}
label {
 background-color: black;color: white;
}
input {
	background-color: black; color: white;
}
div {
	background-color: black;color: white;
 padding-left: 500px;
 padding-right: 600px;
}

</style>
</head>
<body>
<h3 style="text-align: center;padding-right: 90px">Login</h3><br>
	<form action="deposit">
		<div class="mb-3">
			<label class="form-label">Enter Account-Number </label> <input
				type="number"  name="accountno"class="form-control" style="background-color: black; color: white;">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter DepositAmount</label> <input
				type="number" name="balance"class="form-control" style="background-color: black; color: white;">
				<br>
				<button type="submit" class="btn btn-success">Submit</button>
		</div>
		
		
	</form>
</body>
</html>