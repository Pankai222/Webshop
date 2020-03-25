package com.webshop.demo.Model;

import javax.persistence.*;
import java.util.List;

/*
category to which the product belongs, e.g. dry goods, dairy, ...
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private List<Product> products;


}
