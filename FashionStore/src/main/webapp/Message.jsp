<%-- 
    Document   : Message
    Created on : Feb 13, 2024, 5:52:23 PM
    Author     : jeshanpatel1510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <% if(request.getAttribute("message-type") == "error"){ %>
        <title><%= request.getAttribute("message-type") %></title>
        <link rel="icon" type="image/jpg" href="images/error-solid.jpg" />
        <% }else if(request.getAttribute("message-type") == "success"){ %>
        <title><%= request.getAttribute("message-type") %></title>
        <link rel="icon" type="image/jpg" href="images/success-solid.jpg" />
        <% } %>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        <div class="container m-5">
            <div class="row m-5">
                <% if(request.getAttribute("message-type") == "error"){ %>                      
                    <div class="col-md-8 card m-auto border border-2 border-danger">
                        <div class="card-body">
                            <div class="row">
                                <div class="card-img">
                                    <img src="images/error-solid.jpg" width="100px" height="100px" />
                                </div>
                            </div>
                            <div class="row">
                                <h1 class="text-danger"><%= request.getAttribute("message") %></h1>
                            </div>
                        </div>
                    </div>
                <% }else if(request.getAttribute("message-type") == "success"){ %>                      
                    <div class="col-md-8 card m-auto border border-2 border-success">
                        <div class="card-body">
                            <div class="row">
                                <div class="card-img">
                                    <img src="images/check-solid.jpg" width="100px" height="100px" />
                                </div>
                            </div>
                            <div class="row">
                                <h1 class="text-success"><%= request.getAttribute("message") %></h1>
                            </div>
                        </div>
                    </div>
                <% } %>
            </div>
        </div>
    </body>
</html>
