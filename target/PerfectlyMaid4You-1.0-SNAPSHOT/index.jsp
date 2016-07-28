<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 3/5/2016
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>
<html>
  <head>

    <title>PM4U</title>
    <link rel="stylesheet" type="text/css" href="index.css">

  </head>
  <body>
  <header>
    <table>
      <tr>
        <td><a href="index.jsp"><img src="images/logo.jpg"/></a></td>
        <td><h1>PM4UWeb Portal</h1></td>
      </tr>
    </table>

  </header>
  <%
    System.out.println("On index.jsp");
  %>
  <section>
      <p>Hello World. Today's Date Is: <%= (new java.util.Date()).toString()%></p>


  </section>
  <aside>
      <ul type="none">
        <li><button><a href="schedule.jsp">Scheduling</a></button></li>
        <li><button><a href="/client/list">Clients</a></button></li>
        <li><button><a href="/employee/list">Sub Contractors</a></button></li>
      </ul>
  </aside>

  <footer>
      <p>PerfectlyMaid4You&trade;</p>
  </footer>
  </body>
</html>
