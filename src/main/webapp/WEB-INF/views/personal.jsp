<%-- 
    Document   : basicinfo
    Created on : 17 Mar, 2017, 9:51:43 AM
    Author     : Dinesh
--%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>

        <title>BasicInfo</title>
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
                            <li><a href="/PlacementCell/basicinfo">BasicInfo</a></li>
                            <li><a href="/PlacementCell/pregraduate">Pre Graduation</a></li>
                            <li><a href="/PlacementCell/ugraduate">Under Graduation</a></li>
                            <li><a href="#">Personal Details</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Events</a></li>
                    <li><a href="#">Interview History</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <h3>Basic Info</h3>
            <form:form class="form-horizontal" method="POST" modelAttribute="details">

                <div class="form-group">

                    <label class="control-label col-sm-2"  for="fatherName" id="fatherName">FatherName</label>
                    <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="fatherName" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="motherName" id="motherName">MotherName</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="motherName" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="motherOccupation" id="motherOccupation">MotherOccupation</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="motherOccupation" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="community" id="community">community</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="community" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="languagesKnown" id="languagesKnown">LanguagesKnown</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="languagesKnown" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="address" id="address">Address</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="address" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="placementDetails" id="placementDetails">PlacementDetails</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="placementDetails" ></form:input>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="willingness" id="willingness">willingness</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="willingness" ></form:input>
                        </div>
                    </div>






                    <div class="form-group">        
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                    </div>
            </form:form>

        </div>
    </body>
</html>
