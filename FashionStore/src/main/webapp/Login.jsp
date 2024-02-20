<%-- 
    Document   : Login
    Created on : Feb 13, 2024, 9:34:34 AM
    Author     : jeshanpatel1510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Login</title>
        <style>
            body{
                background: url('https://wallpapercave.com/wp/wp3416331.jpg');
                background-repeat: no-repeat;
                background-size: cover;
                image-resolution:  50%;
            }
        </style>        
    </head>
    <body>
        <div class="container text-white">
            <div class="row mt-5">
                <div class="col-md-5 mx-auto mt-5 pt-3 bg-black bg-opacity-50">
                    <div class="row text-center my-2">
                        <div class="col-md-5 mx-auto">
                            <h2>Sign In</h2>
                            <hr class="border border-3">
                        </div>
                    </div>
                    <form action="Login" method="post">
                        <div class="row my-3">
                            <div class="col-md-8 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Username</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="username" class="form-control bg-transparent border border-3 text-white" />
                                </div>                                
                            </div>                          
                        </div>
                        <div class="row my-3">
                            <div class="col-md-8 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Password</label>
                                </div>
                                <div class="row">
                                    <input type="password" name="password" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>                            
                        </div>
                        <div class="row my-5">
                            <div class="col-md-5 mx-auto">
                                <div class="row">
                                    <input type="submit" value="Sign In" class="btn btn-info fw-bold" />
                                </div>
                            </div>
                            <div class="col-md-5 mx-auto">
                                <div class="row">
                                    <input type="button" value="Reset" class="btn btn-outline-warning fw-bold" />
                                </div>                                
                            </div>                            
                        </div>                        
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
