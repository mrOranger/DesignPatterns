package Structural.Proxy.Repository;

import Structural.Proxy.Customer;
import java.util.List;

public interface CustomerRepository {
    List<Customer> index();
    Customer find(String id);
    void create(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
