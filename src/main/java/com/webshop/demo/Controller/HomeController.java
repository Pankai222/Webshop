package com.webshop.demo.Controller;

import com.webshop.demo.Model.Category;
import com.webshop.demo.Model.CompanyDescription;
import com.webshop.demo.Model.Product;
import com.webshop.demo.Service.CategoryService;
import com.webshop.demo.Service.CompanyDescriptionService;
import com.webshop.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    CompanyDescriptionService companyDescriptionService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("prod", productService.getAll());

        return ("index");

    }

    @GetMapping("/create")
    public String create() {
        return("/create");
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product prod, Category cat, CompanyDescription comp) {
        productService.create(prod);
        categoryService.create(cat);
        companyDescriptionService.create(comp);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model) {

        model.addAttribute("prod",productService.findById(id));
        return("update");
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product prod) {
        productService.update(prod);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model) {
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/produktside")
    public String produktside(Model model) {

        model.addAttribute("prod",productService.getAll());
        return("produktside");
    }

}
