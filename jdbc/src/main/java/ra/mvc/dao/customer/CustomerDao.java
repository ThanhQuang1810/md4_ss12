package ra.mvc.dao.customer;

import ra.mvc.model.Customer;
import ra.mvc.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements ICustomerDao {
    @Override
    public List<Customer> findAll() {
        List<Customer> list = new ArrayList<>();
        // mở két nối
        Connection conn = ConnectionDB.getConnection();
        CallableStatement callst = null;
        try{
            callst = conn.prepareCall("select * from customer");
            ResultSet rs = callst.executeQuery();
            while (rs.next()){
                Customer c = new Customer(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("email")
                );
                list.add(c);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // dóng kết nối
            ConnectionDB.closeConnection(conn);
        }
        return list;
    }

    @Override
    public Customer findById(Integer id) {
        // mở két nối
        Connection conn = ConnectionDB.getConnection();
        CallableStatement callst = null;
        try{
            callst = conn.prepareCall("select * from customer where  id = ?");
            ResultSet rs = callst.executeQuery();
            if(rs.next()){
                Customer c = new Customer(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("email")
                );
                return c;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // dóng kết nối
            ConnectionDB.closeConnection(conn);
        }
        return null;
    }

    @Override
    public void create(Customer customer) {
        // mở két nối
        Connection conn = ConnectionDB.getConnection();
        CallableStatement callst = null;
        try{
            callst = conn.prepareCall("INSERT into customer(name, address, email) value(?,?,?)");
            callst.setString(1,customer.getName());
            callst.setString(2,customer.getAddress());
            callst.setString(3,customer.getEmail());
            callst.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // dóng kết nối
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void update(Customer customer) {
        // mở két nối
        Connection conn = ConnectionDB.getConnection();
        CallableStatement callst = null;
        try{
            callst = conn.prepareCall("update customer set name=?, address=?, email=? where  id =?");
            callst.setString(1,customer.getName());
            callst.setString(2,customer.getAddress());
            callst.setString(3,customer.getEmail());
            callst.setInt(4,customer.getId());
            callst.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // dóng kết nối
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void delete(Integer id) {
        Connection conn = ConnectionDB.getConnection();
        CallableStatement callst = null;
        try{
            callst = conn.prepareCall("delete from customer where  id =?");
            callst.setInt(1,id);
            callst.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // dóng kết nối
            ConnectionDB.closeConnection(conn);
        }
    }
}
