<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 9/10/2024
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thong tin khach hang</h1>
<a href="/customers?action=GETALL">Quay lai danh sach</a>
<table border="10" cellspacing="10" cellpadding="10">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <tr>
            <td>${cus.id}</td>
            <td>${cus.name}</td>
            <td>${cus.address}</td>
            <td>${cus.email}</td>
        </tr>
    </tbody>
</table>
</body>
</html>
