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


        <form:form commandName="users" action="us.htm">
            <h1 class="center">Users</h1>
            <table>

                <table>
                    <h1 class="center">User login details</h1>
                    <tr>
                        <td>User Name</td>
                        <td><form:input type="text" name="User Name" path="username" /></td>
                    </tr>

                    <tr>
                        <td>Password</td>
                        <td><form:input type="password" name="Password" path="password" /></td>
                    </tr>
                </table>

                <table>
                    <h1 class="center">Shipping Details</h1>
                    <tr>
                        <td>First Name</td>
                        <td><form:input type="text" name="First Name" path="fname" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><form:input type="text" name="Last Name" path="lname" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><form:input type="text" name="Address" path="address" /></td>
                    </tr>
                    <tr>
                        <td>Shipping Address</td>
                        <td><form:input type="text" name="Billing Address" path="shippingAddress" /></td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td><form:input type="text" name="City" path="city" /></td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td><form:input type="text" name="Phone Number" path="contactno" /></td>
                    </tr>
                    <tr>
                        <td>Email Address</td>
                        <td><form:input type="text" name="Email" path="emailaddress" /></td>
                    </tr>
                    <tr>
                        <td>Identification Type</td>
                        <td><form:input type="text" name="Identification Type" path="typeId" /></td>
                    </tr>
                    <tr>
                        <td>Id Number</td>
                        <td><form:input type="text" name="Id Number" path="idNo" /></td>
                    </tr>

                    <tr colspan="2">
                        <td ><input type="submit" value="Submit"/></td>
                    </tr>
                </table>
            </form:form>
    </body>
</html>
