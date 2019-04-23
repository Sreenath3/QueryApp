<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add trainee</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	font-family: verdana;
}

/* Full-width input fields */
input[type=number], input[type=text] {
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
	width: 30%;
}

h2 {
	text-align: center;
}

a {
	font-family: verdana;
}
</style>

</head>
<body>
	<div class="container">
		<h2
			style="text-align: center; background-color: skyblue; padding: 30px; width: 100%;">
			<b>Gear Technical Forum</b>

		</h2>

		<h3 align="center">Answer The Query</h3>
		<a href="/">Home</a>

		<form action="/query/save" method="post">
			<table align="center" border=2>


				<tr>
					<th>Query Id:<input style="align: left;" type="number" name="id"
						value="${SHOW.id}" readonly /></th>
				</tr>
				<br>
				<tr>
					<th>Select Technology:<input type="text" name="technology"
						value="${SHOW.technology }" readonly /></th>
				<tr>
					<br>
				<tr>
					<th>Question: <input type="text" name="question"
						value="${SHOW.question }" readonly /></th>
					</th>
				</tr>
				<tr>
					<th>Question Raised BY: <input type="text"
						name="question_raised_by" value="${SHOW.question_raised_by}" readonly /></th>
					</th>
				</tr>
				<tr>
					<th>Solution: <input type="text" name="solution" required
						autofocus /></th>
					</th>
				</tr>
				<tr>
					<th>AnsweredBy:<select type ="text" name="answered_by">
							<option>uma</option>
							<option>rahul</option>
							<option>kavitha</option>
							<option>nikhil</option>
					</select></th>


				</tr>

				<tr>
					<th><button class="btn btn-primary" type="submit">Update
							Query</button></th>
				</tr>

			</table>
	</div>
	</form>
</body>
</html>