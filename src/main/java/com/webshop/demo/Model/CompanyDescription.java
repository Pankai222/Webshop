package com.webshop.demo.Model;

import javax.persistence.*;

/*
product description provided by the company
 */
@Entity
public class CompanyDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    private Product product;

}
