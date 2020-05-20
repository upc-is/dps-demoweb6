package pe.edu.upc.model.repository;

import pe.edu.upc.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> findAll() throws Exception;
    Optional<Customer> findById(Integer id) throws Exception;
}
