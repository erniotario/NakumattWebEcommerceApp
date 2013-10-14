<%-- 
    Document   : product
    Created on : Aug 26, 2013, 5:29:23 PM
    Author     : Clapton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
       
            <form:form commandName="products" action="prod.htm">
                <h1 class="fs-title">Products</h1>

                <table>


                    <tr>
                        <td>Name</td>
                        <td><form:input path="name"/></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><form:input path="price"/></td>
                    </tr>
                    <tr>
                        <td>Category:</td>
                        <td>
                            <form:select path="categories">
                                <form:option value="0" label="   -- Please Select --" />
                                <form:options items="${categoryList}" itemLabel="name" itemValue="CategoryId"/>
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><form:input path="description" /></td>
                    </tr>
                    <tr>
                        <td colspan="center"><input  type="submit" value="Save Product"></td>
                    </tr>
                </table>

            </form:form>
        

    </body>
</html>
