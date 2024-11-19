<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
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
 border: solid 2px green;
}
p {
	font-size: 20px;
	padding-left: 150px;
}
a{
color: white;
}
h1{
padding-left: 600px;
 padding-right: 500px;
 
}
</style>
</head>
<body>
<h1>AccountDetails</h1>
<div>
<p>AccoountNo: ${user.accountno}</p>
<p>Name: ${user.name}</p> 
<p>AccountBalance: ${user.balance}</p>
<p>MobileNumber: ${user.mobno}</p>
<p>AadharNumber: ${user.aadharno}</p>
<p>Age: ${user.age}</p>
<p>Gender: ${user.gender}</p>
<p>City: ${user.city}</p>
<p>Languages: ${user.langauge}</p>
<hr>
<p><a href="depositmoney">DepositMoney</a></p>
<p><a href="withdrawmoney">WithdrawMoney</a></p>

</div>
</body>
</html>