package Structural.Proxy.Service;

import Structural.Proxy.Customer;
import Structural.Proxy.Repository.CustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements CustomerRepository {
    private List<Customer> database;

    public CustomerService() {
        this.database = new LinkedList<>();
    }

    @Override
    public List<Customer> index() {
        return this.database;
    }

    @Override
    public Customer find(String id) throws IllegalStateException {
        for (Customer customer : this.database) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        throw new IllegalStateException("Customer " + id + " not found!");
    }

    @Override
    public void create(Customer customer) {
        this.database.add(customer);
    }

    @Override
    public void update(Customer customer) {
        final var oldCustomer = this.find(customer.getId());
        oldCustomer.setFirstName(customer.getFirstName());
        oldCustomer.setLastName(customer.getLastName());
    }

    @Override
    public void delete(Customer customer) {
        final var oldCustomer = this.find(customer.getId());
        this.database.remove(oldCustomer);
    }
}
