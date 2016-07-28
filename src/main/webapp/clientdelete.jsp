<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/13/2016
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client Delete</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Delete Client</h1></td>
        </tr>
    </table>
</header>
<section>
    <form:form name="clientNameForm" method="get" path="clientNameForm" action="/client/delete/submit"
               modelAttribute="client">
        <table class="client_table">
            <tr>
                <td><form:input path="name" name="name" value="${client.name}"/></td>
                <td><input class="table_buttons" type="submit" value="Search"/></td>
            </tr>
        </table>
    </form:form>
    <form:form name="clientEditForm" method="post" modelAttribute="client" action="/client/edit/delete">
        <table class="client_table">
            <tr>
                <td>Client Id: <form:input path="id" name="id" value="${client.id}" readonly="true"/></td>
            </tr>
            <tr>
                <td>Name: <form:input name="name" path="name" type="text" value="${client.name}" readonly="true"/></td>
                <td>Address: <form:input name="address" type="text" path="address" value="${client.address}" readonly="true"/></td>
            </tr>
            <tr>
                <td>Primary Phone: <form:input name="primaryPhone" type="tel" path="primaryPhone"
                                               value="${client.primaryPhone}" readonly="true"/></td>
                <td>Additional Phone: <form:input name="additionalPhone" type="tel" path="additionalPhone"
                                                  value="${client.additionalPhone}" readonly="true"/></td>
            </tr>
            <tr>
                <td>Email: <form:input name="email" type="text" path="email" value="${client.email}" readonly="true"/></td>
                <td>Cleaning Type: <form:select name="cleaningtype" path="cleaningtype" value="${client.cleaningtype}" readonly="true">
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
                <td>Initial Charge: <form:input name="initialCharge" type="money" path="initialCharge" min="0"
                                                value="${client.initialCharge}" readonly="true"/></td>
                <td>Price: <form:input name="price" type="money" path="price" min="0" value="${client.price}" readonly="true"/></td>
            </tr>
            <tr>
                <td>Active: <form:checkbox name="active" path="active" value="${client.active}" readonly="true"/></td>
                <td>Notes: <form:textarea name="notes" type="text" path="notes" value="${client.notes}" readonly="true"/></td>
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
