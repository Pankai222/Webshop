package com.webshop.demo.Service;

import com.webshop.demo.Model.Product;
import com.webshop.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        for (Product product : productRepository.findAll()) {
            productList.add(product);
        }

        return productList;
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public void create(Product prod) {
        productRepository.save(prod);
    }

    public void update(Product prod) {
        productRepository.save(prod);
    }

    public Product findById(Long id) {
        Optional<Product> optionalProd = productRepository.findById(id);
        if (!optionalProd.isPresent()) {
            throw new RuntimeException("Produkt kunne ikke findes");
        }
        return optionalProd.get();
    }
}
