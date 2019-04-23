<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="main.css">
<script src="webjars/jquery/2.0.0/jquery.min.js"></script>
<style>
body {
	font-family: verdana;
}

/* Full-width input fields */
input[type=number], input[type=password] {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 10px 10px;
  margin: 15px 0;
  border: none;
  cursor: pointer;
  width: 10%;
}
h2
{
 text-align:center;
}
a
{
font-family:verdana;
}


</style>

</head>
<body>
	<div class="container">
		<h2
			style="text-align: center; background-color: skyblue; padding: 30px; width: 100%;">
			<b>Gear Technical Forum</b>
			
		</h2>
	
	<form action="query/show" method="post">
		
		
		
			<h3 style="font-size: 25px;">Query Id:</h3>
			<input type="number" name="id" value="id">

			
			

			<button class="btn btn-primary" type="submit">Search</button>
			

		</div>



	</form>
	

	
	</div>

</body>
</html>