package com.webshop.demo.Repository;

import com.webshop.demo.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
