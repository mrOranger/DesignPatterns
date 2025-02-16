package Structural.Proxy;

import Structural.Proxy.Service.CustomerCache;
import Structural.Proxy.Service.CustomerService;

public class Client {
    public static void main(String[] args) {
        final var repository = new CustomerCache(new CustomerService());

        repository.create(new Customer("1", "Mario", "Neri"));
        repository.create(new Customer("2", "Maria", "Rossi"));
        repository.create(new Customer("3", "Federico", "Gialli"));
        repository.create(new Customer("4", "Federica", "Bruni"));
        repository.create(new Customer("5", "Giulio", "Neri"));
        repository.create(new Customer("6", "Giulia", "Rossi"));
        repository.create(new Customer("7", "Francesco", "Gialli"));
        repository.create(new Customer("8", "Francesca", "Bruni"));
        repository.create(new Customer("9", "Luigi", "Neri"));
        repository.create(new Customer("10", "Luigia", "Rossi"));

        System.out.println(repository.index());
        System.out.println(repository.find("1"));

        repository.delete(new Customer("10", "Luigia", "Rossi"));

        System.out.println(repository.index());
    }
}
