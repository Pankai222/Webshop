package com.webshop.demo.Repository;

import java.util.List;

public interface ProductCRUDInterface<T> {

    void create(T t);
    boolean update(T t);
    boolean delete(long id);
    T read(long id);
    List<T> listProducts();
}
