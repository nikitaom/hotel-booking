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
<title>User-book</title>
<head>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>

</head>

<body>
<div class="maim_div">

    <nav role="navigation" class="navbar navbar-default">
        <div class="">
            <a href="#" class="navbar-brand">User book</a>
        </div>
    </nav>

    <div class="container">
        <a href="/new-user" type="button" class="btn btn-success add_user_btn">+add user</a>
        <a href="/show-users" type="button" class="btn btn-success add_user_btn">show all usersr</a>
        <a href="/show-rooms" type="button" class="btn btn-success add_user_btn">show all rooms</a>
        <a href="/show-free-rooms" type="button" class="btn btn-success add_user_btn">show free rooms</a>
    </div>

</div>
</body>
</html>
