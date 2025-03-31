package repository.databaseuno.repository;

import java.util.List;

public interface iRepository <T>{

    List<T> findAll();
    T getById(int id);
    void save(T t);
    void delete(int id);
}
