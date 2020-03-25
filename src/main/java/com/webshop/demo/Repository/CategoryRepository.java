package com.webshop.demo.Repository;

import com.webshop.demo.Model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
