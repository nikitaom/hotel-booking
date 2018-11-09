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
        <a href="#" class="navbar-brand">User book</a>
    </div>
</nav>

    <div class="container">
        <a href="/new-user" type="button" class="btn btn-success add_user_btn">+add user</a>
    </div>

<div class="table_list">
<table id="table" class="table table-striped table-bordered">

    <thead>
        <tr>
            <td>Name</td>
            <td>Email</td>
            <td class="column">Delete</td>
        </tr>
    </thead>

    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td class="column">
                <a type="button" class="btn btn-sm btn-danger" href="/delete/${user.id}"><span
                        class="glyphicon glyphicon-trash" ></span></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</div>
</body>
</html>
