<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 07.11.2018
  Time: 15:45
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
            <a href="#" class="navbar-brand">Hotel-booking</a>
        </div>
    </nav>

    <div class="container">
        <a href="/new-user" type="button" class="btn btn-success add_user_btn">+add user</a>
        <a href="/all-users" type="button" class="btn btn-success add_user_btn">show all usersr</a>
        <a href="/new-room" type="button" class="btn btn-success add_user_btn">+add room</a>
        <a href="/all-rooms" type="button" class="btn btn-success add_user_btn">show all rooms</a>
        <a href="/free-rooms-for-date" type="button" class="btn btn-success add_user_btn">show free rooms for date</a>
        <a href="/select-rooms-category" type="button" class="btn btn-success add_user_btn">show rooms by category</a>

    </div>

</div>
</body>
</html>
