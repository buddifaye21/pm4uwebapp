<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/11/2016
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="/index.jsp"><img src="/images/logo.jpg"/></a></td>
            <td><h1>Sub Contractors Added successfully</h1></td>
        </tr>
    </table>
</header>
<script>
    setTimeout(function() {
        document.location = "/employee/list";
    }, 5000); // <-- this is the delay in milliseconds
</script>
<section>
    <h3>Sub contractor has been added successfully.</h3>
    <h3> You will be redirected to the Sub Contractor home page in 5 Seconds.</h3>
</section>
<aside>

</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
