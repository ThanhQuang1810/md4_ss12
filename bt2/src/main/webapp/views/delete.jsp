<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Xóa Sinh Viên</title>
</head>
<body>
<h1>Xóa Sinh Viên</h1>
<form action="students?action=delete" method="post">
    <input type="hidden" name="id" value="${student.id}">
    <p>Bạn có chắc chắn muốn xóa sinh viên <b>${student.fullName}</b> không?</p>
    <button type="submit">Xóa</button>
    <a href="students">Hủy</a>
</form>
</body>
</html>
