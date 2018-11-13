<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 13.11.2018
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 10.11.2018
  Time: 00:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>Hotel-booking</title>
<head>
    <link href="css/style.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>

<body>
<div class="maim_div">

    <nav role="navigation" class="navbar navbar-default">
        <div class="">
            <a href="/" class="navbar-brand">Hotel-booking</a>
        </div>
    </nav>


    <div class="table_list">
        <table id="table" class="table table-striped table-bordered">
            <thead>
            <tr>
                <td>Room №</td>
                <td>Category</td>
                <td>Price</td>
                <td>Descripton</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${rooms}" var="room">
                <tr>
                    <td>${room.roomNumber}</td>
                    <td>${room.category}</td>
                    <td>${room.roomPrice}</td>
                    <td>${room.description}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
