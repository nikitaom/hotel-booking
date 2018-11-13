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
    <form:form method="post" modelAttribute="room" action="/new-room">
        <form:hidden path="id"/>
        <fieldset class="form-group">
            <form:label path="roomNumber">Room №</form:label>
            <form:input path="roomNumber" type="text" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <form:label path="category">Category</form:label>
            <form:input path="category" type="text" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <form:label path="roomPrice">Price</form:label>
            <form:input path="roomPrice" type="text" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <form:label path="description">Description</form:label>
            <form:input path="description" type="text" class="form-control"/>
        </fieldset>
        </fieldset>
        <button type="submit" class="btn btn-success">Save</button>
        <a href="/all-rooms" type="button" class="btn btn-default">Discard</a>
    </form:form>
</div>
</body>
</html>
