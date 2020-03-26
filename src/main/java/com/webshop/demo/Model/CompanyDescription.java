package com.webshop.demo.Model;

import javax.persistence.*;

/*
product description provided by the company
 */
@Entity
@Table(name="company_description")
public class CompanyDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compDescription;

    @OneToOne()
    private Product product;

    public CompanyDescription(String compDescription, Product product) {
        this.compDescription = compDescription;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompDescription() {
        return compDescription;
    }

    public void setCompDescription(String compDescription) {
        this.compDescription = compDescription;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
