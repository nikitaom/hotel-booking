<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 13.11.2018
  Time: 14:45
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
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>--%>
    <script src="js/jquery-1.12.4.js"></script>
</head>

<body>
<script>
    function getSelected() {
        var e = document.getElementById("roomsCat");
        return e.options[e.selectedIndex].text;
    }

    function addURL(element)
    {
        var adds = getSelected();
        $(element).attr('href', function() {
            return this.href + adds;
        });
    }
</script>

<div class="maim_div">

    <nav role="navigation" class="navbar navbar-default">
        <div class="">
            <a href="#" class="navbar-brand">Hotel-booking</a>
        </div>
    </nav>

    <select id="roomsCat" >
        <option value="1">1 person</option>
        <option value="2">2 persons</option>
        <option value="3">lux</option>
        <option value="4">presedent lux</option>
    </select>


    <div class="container">
        <a onclick="addURL(this)" href="/rooms-by-category/"
           type="button" class="btn btn-success add_user_btn">find ></a>
    </div>

</div>
</body>
