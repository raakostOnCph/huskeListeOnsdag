<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>


<h1>  ${requestScope.msg}   </h1>

<h2> her kan du oprette dig som bruger i den smarte huskeliste app</h2>


<form action="hello-servlet" , method="get">

    <label for="name">Navn:</label><br>
    <input type="text" id="name" name="name" value="John"><br>

    <label for="pass1">password:</label><br>
    <input type="text" id="pass1" name="pass1"><br><br>

    <label for="pass2">gentag password:</label><br>
    <input type="text" id="pass2" name="pass2"><br><br>

    <input type="submit" value="opret">

</form>


</form>

</body>
</html>