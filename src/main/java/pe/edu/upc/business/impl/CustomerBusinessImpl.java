package pe.edu.upc.business.impl;

import pe.edu.upc.business.CustomerBusiness;
import pe.edu.upc.model.entity.Customer;
import pe.edu.upc.model.repository.CustomerRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named
public class CustomerBusinessImpl implements CustomerBusiness {

    @Inject
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) throws Exception {
        return customerRepository.findById(id);
    }
}
