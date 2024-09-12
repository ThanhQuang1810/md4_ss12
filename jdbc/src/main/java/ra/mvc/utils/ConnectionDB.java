package ra.mvc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // mở kết nối
    public static Connection getConnection() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // mở kết nối
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?createDatabaseIfNotExist=true","root","thanhquang1810");
            return conn;
        }catch (ClassNotFoundException e){
            // lớp ko tìm thấy
            System.err.println("Driver not found");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.err.println("lỗi kết nối");
            throw new RuntimeException(e);
        }
    }
    // đóng kết nối
    public static void closeConnection(Connection conn){
        try {
            if (!conn.isClosed()){
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("lỗi đon kết nối");
            throw new RuntimeException(e);
        }
    }
}
