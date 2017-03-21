<%-- 
    Document   : advisor_add_student
    Created on : 20 Mar, 2017, 11:59:29 PM
    Author     : Dinesh
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add students</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Add Students</a>
                </div>
                <ul class="nav navbar-nav">
                    <li  class="active"><a href="#">Add Students</a></li>
                    <li><a href="/PlacementCell/event">Verify</a></li>
                    <li><a href="/PlacementCell/logout">Logout</a></li>
                </ul>
            </div>
        </nav>
        <!-- Navigation End-->

        <!-- Content-->
        <div class="container">
            <h2>Add Student</h2>
            <form class="form-inline" method="POST" action="/PlacementCell/advisor/addstudentc">
                <div class="form-group">
                    <label for="count">Enter the count</label>
                    <input type="number" class="form-control" id="count" name="count" placeholder="Enter count">
                </div>
                <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>

        <div class="container">
            <% int count = 1;
                String flag = "";
                if (request.getAttribute("flag") != null) {
                    flag = request.getAttribute("flag").toString();
                }

                if (request.getAttribute("count") != null) {
                    count = Integer.parseInt(request.getAttribute("count").toString());
                }
                if (flag.equals("ok") && count == 0) { %> <h2>Successfully Added</h2> <% } else if (flag.equals("notok")) {
            %><h2>Error Try Again</h2><%  } else {
                }%> 
            <form class="form-inline" action="/PlacementCell/advisor/addstudentsave" method="POST" >
                <br>
                <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
                <%

                    for (int i = 1; i <= count; i++) {%>
                <div class="form-group" >

                    <label for="username"  >Email:</label>
                    <input type="text" class="form-control" id="<%="email" + i%>" placeholder="Enter email">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="<%="email" + i%>" placeholder="Enter password">
                </div>
                <br>
                <br>

                <%}%>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>

    </body>
</html>

