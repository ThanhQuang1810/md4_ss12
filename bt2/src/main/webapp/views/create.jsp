<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Student</title>
</head>
<body>
<h1>Create New Student</h1>
<form action="students?action=create" method="post">
    <label for="fullName">Full Name:</label>
    <input type="text" id="fullName" name="fullName" required><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required><br><br>
    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone" required><br><br>
    <label for="status">Status:</label>
    <input type="checkbox" id="status" name="status"><br><br>
    <input type="submit" value="Submit">
</form>
<a href="students?action=list">Back to list</a>
</body>
</html>
