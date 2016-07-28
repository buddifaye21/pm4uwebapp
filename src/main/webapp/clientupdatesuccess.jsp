<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 7/13/2016
  Time: 2:43 PM
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
            <td><h1>Client updated Successfully</h1></td>
        </tr>
    </table>
</header>
<script>
    setTimeout(function() {
        document.location = "/client/list";
    }, 5000); // <-- this is the delay in milliseconds
</script>
<section>
    <h3>Client has been updated successfully.</h3>
    <h3> You will be redirected to the Client home page in 5 Seconds.</h3>
</section>
<aside>

</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>
