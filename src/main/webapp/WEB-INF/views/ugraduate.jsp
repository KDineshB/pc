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
                            <li><a href="#">Under Graduation</a></li>
                            <li><a href="/PlacementCell/personal">Personal Details</a></li>
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

                    <label class="control-label col-sm-2"  for="semOneSgpa" id="semOneSgpa">Sem 1</label>
                    <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semOneSgpa" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semTwoSgpa" id="semTwoSgpa">Sem 2</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semTwoSgpa" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semThreeSgpa" id="semThreeSgpa">Sem 3</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semThreeSgpa" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semFourSgpa" id="semFourSgpa">Sem 4</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semFourSgpa" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semFiveSgpa" id="semFiveSgpa">Sem 5</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semFiveSgpa" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semSixSgpa" id="semSixSgpa">Sem 6</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semSixSgpa" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semSevenSgpa" id="semSevenSgpa">Sem 7</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semSevenSgpa" ></form:input>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="semEightSgpa" id="semEightSgpa">Sem 8</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="semEightSgpa" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="cgpa" id="cgpa">Cgpa</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="cgpa" ></form:input>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="arrearStatus" id="arrearStatus">ArrearStatus</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="arrearStatus" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="noOfStandingArrears" id="NoOfStandingArrears">noOfStandingArrears</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="noOfStandingArrears" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="arrearDetails" id="arrearDetails">ArrearDetails</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="arrearDetails" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="classObtained" id="classObtained">classObtained</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="classObtained" ></form:input>
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
