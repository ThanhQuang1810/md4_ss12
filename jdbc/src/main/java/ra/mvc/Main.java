package ra.mvc;

import ra.mvc.model.Customer;
import ra.mvc.utils.ConnectionDB;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // interface Statement : thực thi câu truy vấn tĩnh
        // interface PrepareStatement : thực thi truy vấn có tham số
        // CallableStatement : call thủ tục
        // chức năng thêm mới
        String sql = "INSERT INTO customer(name, address, email) value (?,?,?)"; // dấu ? đại diện cho tham số
//        String sql = "select * from customer";
        // Mở kết nối
        Connection conn = null;
        conn = ConnectionDB.getConnection();
        // tạo đối tượng STatement
        try {
//            Statement statement = conn.createStatement();
            // thực thi : execute(), executeUpdate(), executeQuery()
//            ResultSet rs = statement.executeQuery(sql);
//            PreparedStatement prepare = conn.prepareStatement(sql);
            // truyền đối số vào
//            prepare.setString(1,"Nguyễn Văn X");
//            prepare.setString(2,"Nghệ An");
//            prepare.setString(3,"x@gmail.com");
            // excecute
//            prepare.executeUpdate();
            // duyệt result set
//            while (rs.next()){
//                Customer c = new Customer();
//                c.setId(rs.getInt("id"));
//                c.setName(rs.getString("name"));
//                c.setAddress(rs.getString("address"));
//                c.setEmail(rs.getString("email"));
//                System.out.println(c);
//            }
            CallableStatement callSt = conn.prepareCall("{call createCustomer(?,?,?,?)}");
            // truyen tham so
            callSt.setString(1,"Huynh Cong tinh");
            callSt.setString(2,"Tan Binh");
            callSt.setString(3,"tinh@gmail.com");
            // dăng ki tham so out
            callSt.registerOutParameter(4,Types.INTEGER);
            callSt.executeUpdate();
            int total = callSt.getInt(4);
            System.out.println("total = "+total);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            // đóng kết nối
            ConnectionDB.closeConnection(conn);
        }
        System.out.println("kết thúc");
    }
}
