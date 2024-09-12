package org.example.baitap2.services;
import org.example.baitap2.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentService {
    void insertStudent(Student student);
    Student selectStudent(int id);
    List<Student> selectAllStudents();
    boolean deleteStudent(int id) throws SQLException;
    boolean updateStudent(Student student);
}
