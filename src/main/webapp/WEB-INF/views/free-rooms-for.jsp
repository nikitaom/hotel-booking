<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 13.11.2018
  Time: 16:54
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
    <script src="js/jquery-1.12.4.js"></script>

</head>
<body>
<script>
    function getText() {
        var e = document.getElementById("dateText").value;
        return e;
    }

    function addURL(element) {
        if (getText().length < 10) {
            $(element).attr('href', function () {
                this.href = "/free-rooms-for-date";
                return this.href;
            });
        } else {
            var adds = getText();
            $(element).attr('href', function () {
                this.href = "/free-rooms-for/";
                return this.href + adds;
            });
        }
    }
</script>

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
    <fieldset class="form-group">
        <label>Find free rooms for date:</label>
        <input type="text"
               placeholder="01.01.2018"
               pattern="^\s*(3[01]|[12][0-9]|0?[1-9])\.(1[012]|0?[1-9])\.((?:19|20)\d{2})\s*$" required
               class="form-control"
               id="dateText"/>
    </fieldset>
    <div class="container">
        <a onclick="addURL(this)" href=""
           type="button" class="btn btn-success add_user_btn">find ></a>
    </div>
</div>
</body>
</html>