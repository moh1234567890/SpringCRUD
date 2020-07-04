<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/alliens">get students</a>
<a href="/deletealien">delete student</a>
<a href="/searchbyid">search student</a>
<a href="/update">update student</a>

<form action="addalien">
<p>enter student roll no:</p><input type="text"name="aid" placeholder="enter roll no"><br>
<p>enter student name:</p><input type="text"name="aname" placeholder="enter name"><br>
<input type="submit"><br>


</form>

</body>
</html>