package com.webshop.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private String description;

    @OneToOne
    private Company company;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products", fetch = FetchType.EAGER)
    private List<Category> categories;

    @OneToOne
    private CompanyDescription compDesc;

    public Product(long id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Category> getCategory() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public CompanyDescription getCompDesc() {
        return compDesc;
    }

    public void setCompDesc(CompanyDescription compDesc) {
        this.compDesc = compDesc;
    }
}
