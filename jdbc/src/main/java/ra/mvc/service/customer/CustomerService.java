package ra.mvc.service.customer;

import ra.mvc.dao.customer.CustomerDao;
import ra.mvc.dao.customer.ICustomerDao;
import ra.mvc.model.Customer;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerDao customerDao = new CustomerDao();
    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return  customerDao.findById(id);
    }

    @Override
    public void save(Customer customer) {
        if (findById(customer.getId())!=null){
            customerDao.update(customer);
        }else {
            customerDao.create(customer);
        }
    }

    @Override
    public void delete(Integer id) {
        customerDao.delete(id);
    }
}
