<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/13/2016
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client Add</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Add Client</h1></td>
        </tr>
    </table>
</header>
<section>
    <form:form name="clientAddForm" method="post" modelAttribute="client" action="/client/submit">
        <table class="client_table">
            <tr>
                <td>Name: <form:input name="name" path="name" type="text"/></td>
                <td>Address: <form:input name="address" type="text" path="address"/></td>
            </tr>
            <tr>
                <td>Primary Phone: <form:input name="primaryPhone" type="tel" path="primaryPhone"/></td>
                <td>Additional Phone: <form:input name="additionalPhone" type="tel" path="additionalPhone"/></td>
            </tr>
            <tr>
                <td>Email: <form:input name="email" type="text" path="email"/></td>
                <td>Cleaning Type: <form:select name="cleaningtype" path="cleaningtype">
                    <form:option value="---Select Type---"/>
                    <form:option value="Onetime Basic"/>
                    <form:option value="Onetime Deep"/>
                    <form:option value="Spring Clean"/>
                    <form:option value="Move In"/>
                    <form:option value="Move Out"/>
                    <form:option value="Recurring"/>
                </form:select>
                </td>
            <tr>
                <td>Initial Charge: <form:input name="initialCharge" type="money" path="initialCharge" min="0"/></td>
                <td>Price: <form:input name="price" type="money" path="price" min="0"/></td>
            </tr>
            <tr>
                <td>Active: <form:checkbox name="active" path="active" value="true"/></td>
                <td>Notes: <form:textarea name="notes" type="text" path="notes"/></td>
            </tr>
            <tr style="text-align: center">
                <td><input class="table_buttons" type="submit" value="Submit"/></td>
                <td><input class="table_buttons" type="cancel" value="Cancel"/></td>
            </tr>
        </table>
    </form:form>
</section>
<aside>
    <ul type="none">
        <li>
            <button><a href="/client/add">Add</a></button>
        </li>
        <li>
            <button><a href="/client/edit">Edit</a></button>
        </li>
        <li>
            <button><a href="/client/delete">Delete</a></button>
        </li>
        <li>
            <button><a href="/client/list">Clients Home</a></button>
        </li>
    </ul>
</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
