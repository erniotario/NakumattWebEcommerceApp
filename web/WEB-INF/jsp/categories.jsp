<%-- 
    Document   : categories
    Created on : Jul 30, 2013, 2:55:52 PM
    Author     : Clapton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK href="../resources/css/style.css" rel="stylesheet" type="text/css">
        <title>Nakumatt</title>
    </head>

    <body>
<!-- another version - flat style with animated hover effect -->
<div class="breadcrumb flat">
	<a href="categorie" class="active">Home</a>
	<a href="productsView">Compare</a>
	<a href="cartsView">Cart</a>
	<a href="Payment">Checkout</a>
	<a href="Payment">Login</a>
</div>


        <form:form commandName="categories" action="cat.htm">
            <h1 class="center">Categories</h1>
            <table>
                <tr>
                    <td>Category Name</td>
                    <td><form:input type="text" name="Category Name" path="name" /></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><form:input type="text" name="Description" path="description" /></td>
                </tr>

                <tr colspan="2">
                    <td ><input type="submit" value="Save Categories"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
