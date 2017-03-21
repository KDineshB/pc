<%-- 
    Document   : event
    Created on : 20 Mar, 2017, 9:41:40 PM
    Author     : Dinesh
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>

        <title>Event</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>

            .error {
                color: #ff0000;
            }
        </style>

    </head>

    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">BasicInfo</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/PlacementCell/home">Home</a></li>
                    <li class="active" class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Student<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">BasicInfo</a></li>
                            <li><a href="/PlacementCell/pregraduate">Pre Graduation</a></li>
                            <li><a href="/PlacementCell/ugraduate">Under Graduation</a></li>
                            <li><a href="/PlacementCell/personal">Personal Details</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Events</a></li>
                    <li><a href="#">Interview History</a></li>
                    <li><a href="/PlacementCell/logout">Logout</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <h3>Basic Info</h3>

        </div>
    </body>
</html>
