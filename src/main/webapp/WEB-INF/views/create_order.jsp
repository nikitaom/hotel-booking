<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 10.11.2018
  Time: 16:33
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
    <form:form method="post" modelAttribute="order" action="/new-order">
        <form:hidden path="id"/>
        <div class="table_list">
            <table id="table" class="table table-striped table-bordered">
                <thead>
                <tr>
                    <td>Select</td>
                    <td>Room №</td>
                    <td>Category</td>
                    <td>Price</td>
                    <td>Descripton</td>
                </tr>
                </thead>

                <tbody>
                <c:forEach items="${rooms}" var="room">
                    <fieldset class="form-group">
                        <form:label path="breakfast">
                            <tr>
                                <td><form:radiobutton path="room" value="Java" name="room" class=""/></td>
                                <td>${room.roomNumber}</td>
                                <td>${room.category}</td>
                                <td>${room.roomPrice}</td>
                                <td>${room.description}</td>
                            </tr>
                        </form:label>

                    </fieldset>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <fieldset class="form-group">
            <tr>
                <td><form:label path="breakfast">Breakfast</form:label></td>
                <td><form:checkbox path="breakfast" value="Java" class=""/></td>
            </tr>
        </fieldset>

        <fieldset class="form-group">
            <tr>
                <td><form:label path="cleaning">Cleaning</form:label></td>
                <td><form:checkbox path="cleaning" value="Java" class=""/></td>
            </tr>
        </fieldset>

        <button type="submit" class="btn btn-success">Save</button>
        <a href="/all-rooms" type="button" class="btn btn-default">Discard</a>
    </form:form>
</div>
</body>
</html>