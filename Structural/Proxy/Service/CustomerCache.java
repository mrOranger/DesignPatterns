package Structural.Proxy.Service;

import Structural.Proxy.Customer;
import Structural.Proxy.Repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerCache implements CustomerRepository {
    private List<Customer> cache;
    private CustomerRepository repository;

    public CustomerCache(CustomerRepository repository) {
        this.cache = new ArrayList<>();
        this.repository = repository;
    }

    @Override
    public List<Customer> index() {
        if (this.cache.isEmpty()) {
            return this.repository.index();
        }
        System.out.println("Reading from cache");
        return this.cache;
    }

    @Override
    public Customer find(String id) {
        for (Customer customer : this.cache) {
            if (customer.getId().equals(id)) {
                System.out.println("Reading from cache " + id);
                return customer;
            }
        }
        this.cache.clear();
        return this.repository.find(id);
    }

    @Override
    public void create(Customer customer) {
        this.repository.create(customer);
        this.cache.add(customer);
    }

    @Override
    public void update(Customer customer) {
        this.cache.clear();
        this.repository.update(customer);
        this.cache.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.cache.clear();
        this.repository.delete(customer);
    }
}
