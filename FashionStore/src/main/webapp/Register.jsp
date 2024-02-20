<%-- 
    Document   : Register
    Created on : Feb 11, 2024, 6:48:46 PM
    Author     : jeshanpatel1510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Register</title>
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
            <div class="row">
                <div class="col-md-9 mx-auto pt-3 bg-black bg-opacity-50">
                    <div class="row text-center my-2">
                        <div class="col-md-5 mx-auto">
                            <h2>Sign Up</h2>
                            <hr class="border border-3">
                        </div>
                    </div>
                    <form action="Register" method="post">
                        <div class="row my-3">
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Username</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="username" class="form-control bg-transparent border border-3 text-white" />
                                </div>                                
                            </div>
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Password</label>
                                </div>
                                <div class="row">
                                    <input type="password" name="password" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>                            
                        </div>
                        <div class="row my-3">
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Password Question</label>
                                </div>
                                <div class="row">
                                    <select name="passwordQuestion" class="form-control bg-transparent border border-3">
                                        <option value="0"> --- Choose Question --- </option>
                                        <option value="What is Your Childhood Nickname ?"> What is Your Childhood Nickname ? </option>
                                        <option value="What is Your Childhood Favorite Cousin Name ?"> What is Your Childhood Favorite Cousin Name ? </option>
                                        <option value="What is Your Favorite Food ?"> What is Your Favorite Food ? </option>
                                        <option value="Which Country You Would Like to Travel in Future ?"> Which Country You Would Like to Travel in Future ? </option>
                                        <option value="What is Your Favorite Pet ?"> What is Your Favorite Pet ? </option>
                                        
                                    </select>
                                </div>                                
                            </div>
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Password Answer</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="passwordAnswer" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>                            
                        </div>
                        <div class="row my-3">
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Email</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="email" class="form-control bg-transparent border border-3 text-white" />
                                </div>                                
                            </div>
                            <div class="col-md-4 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Phone</label>
                                </div>
                                <div class="row">
                                    <input type="number" name="phone" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>                            
                        </div>
                        <div class="row my-3">
                            <div class="col-md-10 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Address</label>
                                </div>
                                <div class="row">
                                    <textarea name="address" class="form-control bg-transparent border border-3 text-white"></textarea>
                                </div>                                
                            </div>                            
                        </div>                        
                        <div class="row my-3">
                            <div class="col-md-2 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Country</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="country" class="form-control bg-transparent border border-3 text-white" />
                                </div>                                
                            </div>
                            <div class="col-md-2 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">State</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="state" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div> 
                            <div class="col-md-2 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">City</label>
                                </div>
                                <div class="row">
                                    <input type="text" name="city" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>   
                            <div class="col-md-2 mx-auto">
                                <div class="row">
                                    <label class="form-label fw-bold">Pin</label>
                                </div>
                                <div class="row">
                                    <input type="number" name="pin" class="form-control bg-transparent border border-3 text-white" />
                                </div>
                            </div>                             
                        </div>
                        <div class="row my-5">
                            <div class="col-md-5 mx-auto">
                                <div class="row">
                                    <input type="submit" value="Sign Up" class="btn btn-info fw-bold" />
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
