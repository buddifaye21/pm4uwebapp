<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page import="com.perfectlymaid4you.database.EmployeeDao" %>--%>
<%--<%@ page import="org.springframework.context.ApplicationContext" %>--%>
<%--<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Scorpion
  Date: 6/29/2016
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administrator Login</title>
    <link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
<header>
    <table>
        <tr>
            <td><a href="index.jsp"><img src="images/logo.jpg"/></a></td>
            <td><h1>Administrator Login</h1></td>
        </tr>
    </table>

</header>
<section class="loginSection">
    <form>
        <div class="form">
            Username:<br>
            <input type="text" name="username"><br>
            Password:<br>
            <input type="text" name="password">
            <button type="submit" name="login">Login</button>
            <%
                if(request.getParameter("login") != null){
                    response.sendRedirect("index.jsp");
                }
//                ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//                EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
//                System.out.println(employeeDao.getEmployeeList());

//                try {
//                    System.out.println("Before connection");
//                    Connection connection = DriverManager.getConnection("jdbc:mysql://pm4uTime.db.9975369.hostedresource.com/", "pm4uTime", "Lasttime!1");
//                    System.out.println("After connection");
//                    Statement st = connection.createStatement();
//                    ResultSet rs = st.executeQuery("Select * from employees");
//                    if(rs.next()){
//                        System.out.println(rs.getArray("Fname"));
//                    }
//                }catch (Exception e){
//                    e.printStackTrace();
//                    System.out.println("Nope");
//                }
//            if (request.getParameter("login") != null){
//
//                File file = new File("C:\\temp\\website\\userData.txt");
//                FileWriter writer = new FileWriter(file, true);
//                PrintWriter print = new PrintWriter(writer);
//
//                print.println("username: "+request.getParameter("username")+" Password:"+request.getParameter("password")+"\n");
//                print.close();
//
//            }
            %>
        </div>
    </form>
</section>
<aside>

</aside>
<footer>
    <p>PerfectlyMaid4You&trade;</p>
</footer>
</body>
</html>

