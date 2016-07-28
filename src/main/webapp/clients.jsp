<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.servlet.support.RequestContextUtils" %>
<%@ page import="com.perfectlymaid4you.utils.Utils" %>
<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/1/2016
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
    <%--ApplicationContext context = RequestContextUtils.findWebApplicationContext(request);--%>
    <%--Utils utils = (Utils) context.getBean("utils");--%>
<%--%>--%>

<html>
<head>
    <title>Clients</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Clients</h1></td>
        </tr>
    </table>
</header>
<section>
    <table class="employee_table">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Primary Phone</th>
            <th>Cleaning Type</th>
        </tr>
        <c:forEach items="${list}" var="client">
            <tr>
                <td>${client.name}</td>
                <td>${client.email}</td>
                <td>${client.primaryPhone}</td>
                <td>${client.cleaningtype}</td>
            </tr>
        </c:forEach>
    </table>
</section>
<aside>
    <ul type="none">
        <li><button><a href="/client/add">Add</a></button></li>
        <li><button><a href="/client/edit">Edit</a></button></li>
        <li><button><a href="/client/delete">Delete</a></button></li>
    </ul>
</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
