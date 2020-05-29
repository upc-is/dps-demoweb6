package pe.edu.upc.demoweb6.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    T insert(T t) throws Exception;
    T update(T t) throws Exception;
    void delete(T t) throws Exception;
    List<T> findAll() throws Exception;
    Optional<T> findById(ID id) throws Exception;
}