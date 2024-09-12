<%@ page import="org.example.baitap2.models.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Student List</h1>
<a href="students?action=create">Add New Student</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    <%
        List<Student> students = (List<Student>) request.getAttribute("listStudent");
        for (Student student : students) {
    %>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getFullName() %></td>
        <td><%= student.getEmail() %></td>
        <td><%= student.getAddress() %></td>
        <td><%= student.getPhone() %></td>
        <td><%= student.isStatus() %></td>
        <td>
            <a href="students?action=edit&id=<%= student.getId() %>">Edit</a>
            <a href="students?action=delete&id=<%= student.getId() %>">Delete</a>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>
