<%-- 
    Document   : addCategory
    Created on : Jan 28, 2024, 2:47:26 PM
    Author     : jeshanpatel1510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Add Category</title>
    </head>
    <body>
        <div class="container">
            <div class="row text-center my-3">
                <h3>Create Category</h3>
            </div>
            <hr>
            <div class="row my-3">
                <div class="col-md-6 mx-auto">
                    <form action="AddCategory" method="post">
                        <div class="mb-3">
                            <label class="form-label fw-bold">Category Name</label>
                            <input type="text" class="form-control" name="categoryName">
                        </div>
                        <div class="mb-3">
                            <label class="form-label fw-bold">Parent Category</label>
                            <select name="parent_categoryId" class="form-control">
                                <option value="0">--- Choose Category ---</option>
                                <option value="1"> Kids </option>
                                <option value="2"> Men </option>
                                <option value="3"> Women </option>
                                <option value="4"> Footwear </option>
                                <option value="5"> Accessories </option>
                                <option value="6"> Beauty </option>
                                <option value="7"> Sports 7 Fitness </option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Create</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
