<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Sub Contractors</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Sub Contractors</h1></td>
        </tr>
    </table>
</header>
<section>
    <table class="employee_table">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>
        <c:forEach items="${list}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName} ${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.phone}</td>
            </tr>
        </c:forEach>
    </table>

</section>
<aside>
    <ul type="none">
        <li><button><a href="/employee/add">Add</a></button></li>
        <li><button><a href="/client/list">Clients</a></button></li>
        <li><button><a href="/employee/list">Sub Contractors</a></button></li>
    </ul>
</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
