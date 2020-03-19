package com.webshop.demo.Service;

import com.webshop.demo.Model.Product;
import com.webshop.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void create(Product product) {
        productRepository.create(product);
    }

    public List<Product> listAll() {

        List<Product> products = new ArrayList<>();
        for (Product product : productRepository.listProducts()) {
            products.add(product);
        }

        return products;
    }

    public boolean update(Product product) {
        return productRepository.update(product);
    }

    public boolean delete(long id) {
        return productRepository.delete(id);
    }

    public Product read(long id) {
        return productRepository.read(id);
    }
}
