<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 10.11.2018
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hotel-booking</title>
    <link href="css/style.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav role="navigation" class="navbar navbar-default">
    <div class="">
        <a href="/" class="navbar-brand">Hotel-booking</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <form:form method="get" modelAttribute="booking" action="/show-free-rooms">
        <fieldset class="form-group">
            <form:label path="date">Booking date</form:label>
            <form:input path="date" type="text"
                        placeholder="01.01.2018"
                        pattern="^\s*(3[01]|[12][0-9]|0?[1-9])\.(1[012]|0?[1-9])\.((?:19|20)\d{2})\s*$"
                        class="form-control"/>
        </fieldset>
        <form:input path="user.id" type="hidden" value="${user.id}" class="userIdHide"/>
        <button type="submit" class="btn btn-success">Continue ></button>
        <a href="/all-users" type="button" class="btn btn-default">Discard</a>
    </form:form>
</div>
</body>
</html>
