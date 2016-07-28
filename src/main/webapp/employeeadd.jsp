<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/1/2016
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sub Contractor Add</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Add Sub Contractor</h1></td>
        </tr>
    </table>
</header>
<section>
    <form:form name="employeeAddForm" method="post" modelAttribute="employee" action="/employee/submit">
        <table class="employee_table">
            <tr>
                <td>First name: <form:input name="firstName" path="firstName" type="text"/></td>
                <td>Last name: <form:input name="lastName" path="lastName" type="text"/></td>
            </tr>
            <tr>
                <td>Address: <form:input name="address" type="text" path="address"/></td>
                <td>Phone: <form:input name="phone" type="tel" path="phone"/></td>
            </tr>
            <tr>
                <td>Hourly Rate: <form:input name="hourlyRate" type="number" path="hourlyRate"/></td>
                <td>Email: <form:input name="email" type="text" path="email"/></td>
            <tr>
                <td>Date of Birth: <form:input name="dob" type="date" path="dob"/></td>
                <td>SSN: <form:input name="ssn" type="text" path="ssn"/></td>
            </tr>
            <tr>
                <td>Position: <form:input name="position" type="text" path="position"/></td>
                <td>Hire Date: <form:input name="dateOfHire" type="date" path="dateOfHire"/></td>
            </tr>
            <tr>
                <td>Shirt Size: <form:input name="shirtSize" type="text" path="shirtSize"/></td>
                <td>Emergency Contact: <form:input name="emergencyContact" type="path" path="emergencyContact"/></td>
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
            <button><a href="schedule.jsp">Scheduling</a></button>
        </li>
        <li>
            <button><a href="/client/list">Clients</a></button>
        </li>
        <li>
            <button><a href="/employee/list">Sub Contractors</a></button>
        </li>
    </ul>
</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
