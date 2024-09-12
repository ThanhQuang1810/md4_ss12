<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 9/10/2024
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chinh sua thong tin khach hang</h1>
<form action="/customers" method="post">
    <div>
        <label for="id">Id</label>
        <input type="text" value="${cus.id}" name="id" id="id" readonly>
    </div>
    <div>
        <label for="name">Name</label>
        <input type="text" value="${cus.name}" name="name" id="name">
    </div>
    <div>
        <label for="address">Address</label>
        <input type="text"  value="${cus.address}" name="address" id="address">
    </div>
    <div>
        <label for="email">Email</label>
        <input type="email"  value="${cus.email}" name="email" id="email">
    </div>
    <input type="submit" name="action" value="UPDATE">
</form>
</body>
</html>
