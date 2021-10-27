<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 25/10/2021
  Time: 21.23
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bruger siden</title>
</head>
<body>

<h1>Velkomme til brugersiden du er logget ind som ${sessionScope.navn}</h1>

her kan du oprette emner til din huske sedel;



<form action="Emnetilføoej" , method="get">

    <label for="name">nyt emne:</label><br>
    <input type="text" id="name" name="emne" value="øl bon ?"><br>

    <input type="submit" value="opret">

</form>

<br>
<br>
<br>

<c:forEach items="${sessionScope.emneListe}" var="emne">

    ${emne}
    <br>

</c:forEach>



</body>
</html>
