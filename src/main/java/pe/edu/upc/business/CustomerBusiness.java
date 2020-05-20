package pe.edu.upc.business;

import pe.edu.upc.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerBusiness {
    List<Customer> findAll() throws Exception;
    Optional<Customer> findById(Integer id) throws Exception;
}
