<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sửa Sinh Viên</title>
</head>
<body>
<h1>Sửa Sinh Viên</h1>
<form action="students?action=edit" method="post">
    <input type="hidden" name="id" value="${student.id}">
    <label for="fullName">Họ và Tên:</label>
    <input type="text" id="fullName" name="fullName" value="${student.fullName}" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${student.email}" required><br>
    <label for="address">Địa Chỉ:</label>
    <input type="text" id="address" name="address" value="${student.address}"><br>
    <label for="phone">Số Điện Thoại:</label>
    <input type="text" id="phone" name="phone" value="${student.phone}"><br>
    <label for="status">Trạng Thái:</label>
    <input type="checkbox" id="status" name="status" ${student.status ? 'checked' : ''}><br>
    <button type="submit">Sửa</button>
</form>
</body>
</html>
