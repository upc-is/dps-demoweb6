package pe.edu.upc.model.repository.impl;

import pe.edu.upc.model.entity.Customer;
import pe.edu.upc.model.repository.CustomerRepository;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() throws Exception {
        List<Customer> customers = new ArrayList<>();
        customers.add( new Customer(1, "Jose", "Molina") );
        customers.add( new Customer(2, "Pedro", "Chimuelos") );
        customers.add( new Customer(3, "Manuel", "Castelo") );
        customers.add( new Customer(4, "Rosa", "Rodriguez") );
        return customers;
    }


    /*@Override
    public List<Customer> findAll() throws Exception {
        return null;
    }*/

    @Override
    public Optional<Customer> findById(Integer id) throws Exception {
        Customer customer = new Customer(id, "Jose", "Escarcena");
        return Optional.of(customer);
    }

}
