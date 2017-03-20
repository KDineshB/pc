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
                            <li><a href="#">BasicInfo</a></li>
                            <li><a href="/PlacementCell/pregraduate">Pre Graduation</a></li>
                            <li><a href="/PlacementCell/ugraduate">Under Graduation</a></li>
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
            <form:form class="form-horizontal" method="POST" modelAttribute="student">

                <div class="form-group">

                    <label class="control-label col-sm-2"  for="regNo" id="regNo">RegNo</label>
                    <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="regNo" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="name" id="regNo">Name</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="name" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="clgName" id="regNo">College</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="clgName" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="degree" id="regNo">Degree</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="degree" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="degree" id="degree">Degree</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="degree" ></form:input>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="branch" id="branch">Branch</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="branch" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="section" id="section">Section</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="section" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="dateOfBirth" id="dateOfBirth">D.O.B</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="dateOfBirth" ></form:input>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="gender" id="gender">Gender</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="gender" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="email" id="gender">Mail Id</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="email" ></form:input>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="altEmail" id="altEmail">Alt Mail Id</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="altEmail" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="phone" id="phone">Phone No</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="phone" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="stay" id="phone">Stay</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="stay" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="admissionMode" id="admissionMode">Mode Of Admission</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="admissionMode" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="firstGraduate" id="firstGraduate">Graduate</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="firstGraduate" ></form:input>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="bloodGroup" id="bloodGroup">Blood Group</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="bloodGroup" ></form:input>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2"  for="advisor" id="advisor">Advisor Name</label>
                        <div class="col-sm-10">    
                        <form:input cssClass="form-control" path="advisor" ></form:input>
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
