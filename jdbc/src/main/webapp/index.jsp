<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 9/9/2024
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%-- chuyển trang tự động --%>
<%--<%response.sendRedirect("/TodoServlet?action=GETALL");%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/customers?action=GETALL">Danh sách khách hàng</a>
</body>
</html>
