package pe.edu.upc.demoweb6.model.repository.impl;

import pe.edu.upc.demoweb6.model.entity.Customer;
import pe.edu.upc.demoweb6.model.repository.CustomerRepository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext(unitName = "mysqlPU")
    private EntityManager entityManager;

    @Override
    public Customer insert(Customer customer) throws Exception {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) throws Exception {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    public void delete(Customer customer) throws Exception {
        entityManager.remove(customer);
    }

    @Override
    public List<Customer> findAll() throws Exception {
        List<Customer> customers = new ArrayList<>();
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        customers = query.getResultList();
        return customers;
    }

    @Override
    public Optional<Customer> findById(Integer id) throws Exception {
        Customer customer = entityManager.find(Customer.class, id);
        if(customer == null) {
            return Optional.empty();
        } else {
            return Optional.of( customer );
        }
        /*List<Customer> customers = new ArrayList<>();
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c WHERE c.id = ?1", Customer.class);
        query.setParameter(1, id);
        customers = query.getResultList();

        if( customers == null || customers.isEmpty() )
            return Optional.empty();
        else
            return Optional.of( customers.get(0) );*/
    }
}
