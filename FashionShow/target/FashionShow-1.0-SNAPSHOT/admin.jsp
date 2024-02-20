<%-- 
    Document   : admin
    Created on : Jan 28, 2024, 2:19:39 AM
    Author     : jeshanpatel1510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="cat" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Admin</title>
    </head>
    <body>
        <div class="container">
            <div class="row text-center my-3">
                <h3>Admin Panel</h3>
            </div>
            <hr>
            <div class="row my-3">
                <div class="col-2 mx-auto">
                    <button class="btn btn-primary fw-bold" onclick="showTable('user')">User Table</button>
                </div>
                <div class="col-2 mx-auto">
                    <button class="btn btn-primary fw-bold" onclick="showTable('category')">Category Table</button>
                </div>
                <div class="col-2 mx-auto">
                    <button class="btn btn-primary fw-bold" onclick="showTable('product')">Product Table</button>
                </div>
                <div class="col-2 mx-auto">
                    <button class="btn btn-primary fw-bold" onclick="showTable('cart')">Cart Table</button>
                </div>
                <div class="col-2 mx-auto">
                    <button class="btn btn-primary fw-bold" onclick="showTable('order')">Order Table</button>
                </div>                
            </div>
            <hr>
            <div class="row my-3">
                <h5 class="text-success"><cat:out value="${success}"></cat:out></h5>
                <h5 class="text-danger"><cat:out value="${error}"></cat:out></h5>
            </div>
            <div id="usertb">
                <div class="row my-3 mx-3">
                    <div class="col">
                        <h4>User Table</h4>
                    </div>
                    <div class="col text-end">
                        <button class="btn btn-secondary fw-bold">+ Add User</button>
                    </div>
                </div>
                <div class="row my-3 mx-3">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Password Question</th>
                                <th>Password Answer</th>
                                <th>Email</th>
                                <th>Mobile No.</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>
                                <th>Country</th>
                                <th>Pin</th>
                                <th></th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
            <div id="categorytb" class="d-none">
                <div class="row my-3 mx-3">
                    <div class="col">
                        <h4>Category Table</h4>
                    </div>
                    <div class="col text-end">
                        <a href="/FashionShow/addCategory.jsp" class="btn btn-secondary fw-bold text-decoration-none">+ Add Category</a>
                    </div>
                </div>
                <div class="row my-3">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Category</th>
                                <th>Parent Category Id</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <cat:forEach var="c" items="${CategoryList}">
                                <tr>
                                    <td><cat:out value="${c.categoryName}"></cat:out></td>
                                    <td><cat:out value="${c.parent_categoryId}"></cat:out></td>
                                    <td class="text-end">
                                        <a href="UpdateCategory?id=<cat:out value="${c.categoryId}"></cat:out>" class="btn btn-info text-decoration-none">Update</a>
                                        <a href="RemoveCategory?id=<cat:out value="${c.categoryId}"></cat:out>" class="btn btn-danger text-decoration-none">Remove</a>
                                    </td>
                                </tr>
                            </cat:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="productb" class="d-none">
                <div class="row my-3 mx-3">
                    <div class="col">
                        <h4>Product Table</h4>
                    </div>
                    <div class="col text-end">
                        <button class="btn btn-secondary fw-bold">+ Add Product</button>
                    </div>
                </div>
                <div class="row my-3">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Product</th>
                                <th>Price</th>
                                <th>Unit</th>
                                <th>Discount</th>
                                <th>Category</th>
                                <th>Stock</th>
                                <th></th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
            <div id="cartb" class="d-none">
                <div class="row my-3 mx-3">
                    <div class="col">
                        <h4>Cart Table</h4>
                    </div>
                    <div class="col text-end">
                        <button class="btn btn-secondary fw-bold">+ Add To Cart</button>
                    </div>
                </div>
                <div class="row my-3">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Date/Time</th>
                                <th>Session Id</th>
                                <th>Payment Mode</th>
                                <th>Tax</th>
                                <th>Total Amount</th>
                                <th>Status</th>
                                <th></th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
            <div id="ordertb" class="d-none">
                <div class="row my-3 mx-3">
                    <div class="col">
                        <h4>Order Table</h4>
                    </div>
                    <div class="col text-end">
                        <button class="btn btn-secondary fw-bold">+ Create order</button>
                    </div>
                </div>
                <div class="row my-3">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Order Id</th>
                                <th>Product</th>
                                <th>Price</th>
                                <th>Discount</th>
                                <th></th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>            
        </div>
    </body>
</html>
<script>
    function showTable(id)
    {
        switch (id) {
            case "user":
                document.getElementById("usertb").classList.remove("d-none");
                document.getElementById("categorytb").classList.remove("d-none");
                document.getElementById("productb").classList.remove("d-none");
                document.getElementById("ordertb").classList.remove("d-none");
                document.getElementById("cartb").classList.remove("d-none");
                document.getElementById("categorytb").classList.add("d-none");
                document.getElementById("productb").classList.add("d-none");
                document.getElementById("ordertb").classList.add("d-none");
                document.getElementById("cartb").classList.add("d-none");
                break;
                
            case "category":
                document.getElementById("usertb").classList.remove("d-none");
                document.getElementById("categorytb").classList.remove("d-none");
                document.getElementById("productb").classList.remove("d-none");
                document.getElementById("ordertb").classList.remove("d-none");
                document.getElementById("cartb").classList.remove("d-none");
                document.getElementById("usertb").classList.add("d-none");
                document.getElementById("productb").classList.add("d-none");
                document.getElementById("ordertb").classList.add("d-none");
                document.getElementById("cartb").classList.add("d-none");                
                break;
                
            case "product":
                document.getElementById("usertb").classList.remove("d-none");
                document.getElementById("categorytb").classList.remove("d-none");
                document.getElementById("productb").classList.remove("d-none");
                document.getElementById("ordertb").classList.remove("d-none");
                document.getElementById("cartb").classList.remove("d-none");
                document.getElementById("categorytb").classList.add("d-none");
                document.getElementById("usertb").classList.add("d-none");
                document.getElementById("ordertb").classList.add("d-none");
                document.getElementById("cartb").classList.add("d-none");                
                break;
                
            case "order":
                document.getElementById("usertb").classList.remove("d-none");
                document.getElementById("categorytb").classList.remove("d-none");
                document.getElementById("productb").classList.remove("d-none");
                document.getElementById("ordertb").classList.remove("d-none");
                document.getElementById("cartb").classList.remove("d-none");
                document.getElementById("categorytb").classList.add("d-none");
                document.getElementById("productb").classList.add("d-none");
                document.getElementById("usertb").classList.add("d-none");
                document.getElementById("cartb").classList.add("d-none");                
                break;
                
            case "cart":
                document.getElementById("usertb").classList.remove("d-none");
                document.getElementById("categorytb").classList.remove("d-none");
                document.getElementById("productb").classList.remove("d-none");
                document.getElementById("ordertb").classList.remove("d-none");
                document.getElementById("cartb").classList.remove("d-none");
                document.getElementById("categorytb").classList.add("d-none");
                document.getElementById("productb").classList.add("d-none");
                document.getElementById("ordertb").classList.add("d-none");
                document.getElementById("usertb").classList.add("d-none");                
                break;            
        }
    }
</script>
