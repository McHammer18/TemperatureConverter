<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1> Temperature Converter</h1>
<form action="getTempServlet" method="post">
Enter the number of degrees in Fahrenheit:
<input type="text" name="userTemp" size="10" />
<input type="submit" value="Convert Temp" />
</form>
</body>
</html>