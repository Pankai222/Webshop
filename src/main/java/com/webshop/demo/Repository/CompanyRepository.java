package com.webshop.demo.Repository;

import com.webshop.demo.Model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
