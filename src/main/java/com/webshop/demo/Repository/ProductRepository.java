package com.webshop.demo.Repository;

import com.webshop.demo.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        this.products.add(new Product(1,"Håndsprit",199.95,"Håndsprit mod corona"));
        this.products.add(new Product(2, "Tørgær", 4.95, "Til al slags bagning"));

    }

    public List<Product> listProducts() {
        return products;
    }

    public void create(Product product) {
        products.add(product);
    }

}
