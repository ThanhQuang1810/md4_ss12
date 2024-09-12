package org.example.baitap1.service;

import org.example.baitap1.models.User;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user) throws SQLException;
    User selectUser(int id);
    List<User> selectAllUsers();
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    List<User> searchUsersByCountry(String country);
    List<User> selectAllUsersSortedByName(String sortOrder);
}
