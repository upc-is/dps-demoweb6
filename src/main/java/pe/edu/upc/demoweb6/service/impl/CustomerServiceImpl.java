package pe.edu.upc.demoweb6.service.impl;

import pe.edu.upc.demoweb6.service.CustomerService;
import pe.edu.upc.demoweb6.model.entity.Customer;
import pe.edu.upc.demoweb6.model.repository.CustomerRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Named
public class CustomerServiceImpl implements CustomerService {


    @Inject
    private CustomerRepository customerRepository;

    @Transactional
    @Override
    public Customer insert(Customer customer) throws Exception {
        return customerRepository.insert(customer);
    }

    @Transactional
    @Override
    public Customer update(Customer customer) throws Exception {
        return customerRepository.update(customer);
    }

    @Transactional
    @Override
    public void delete(Customer customer) throws Exception {
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) throws Exception {
        return customerRepository.findById(id);
    }
}
