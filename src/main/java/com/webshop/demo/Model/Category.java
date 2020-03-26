package com.webshop.demo.Model;

import javax.persistence.*;
import java.util.List;

/*
category to which the product belongs, e.g. dry goods, dairy, ...
 */
@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String catName;

    @OneToMany
    private List<Product> products;

    public Category(String catName, List<Product> products) {
        this.catName = catName;
        this.products = products;
    }


}
