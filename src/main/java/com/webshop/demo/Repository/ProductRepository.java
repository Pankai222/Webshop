package com.webshop.demo.Repository;

import com.webshop.demo.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements ProductCRUDInterface<Product> {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        this.products.add(new Product(1,"Håndsprit",199.95,"Håndsprit mod corona"));
        this.products.add(new Product(2, "Tørgær", 4.95, "Til al slags bagning"));

    }

    @Override
    public List<Product> listProducts() {
        return products;
    }

    @Override
    public Product read(long id) {
        int i = 0;
        while(i < products.size()) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
            i++;
        }
        return null;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public boolean update(Product product){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        int i = 0;
        while(i < products.size()) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }



}
