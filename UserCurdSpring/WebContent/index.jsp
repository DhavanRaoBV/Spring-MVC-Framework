<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> CRUD</title>
</head>
<body bgcolor=lightblue>
<h1><center>CRUD Operations</center></h1><hr>
<form action="db.html" method="post">
<table>
<tr>
	<td>Enter Employee ID</td>
	<td><input type=text name=t1 size=20 required></td>
	</tr>
	
	<tr>
	<td>Enter Name</td>
	<td><input type=text name=t2 size=20 required></td>
	</tr>
	
	<tr>
	<td>Enter Address</td>
	<td><input type=text name=t3 size=20 required></td>
	</tr>
	
	
	<tr>
	<td></td>
	<td>  
	<input type=submit value=Insert name=b1>
	<input type=submit value=Update name=b1>
	<input type=submit value=Delete name=b1>
	<input type=submit value=Select name=b1>
	</td>
	</tr>	

</table>
</form>


</body>
</html>