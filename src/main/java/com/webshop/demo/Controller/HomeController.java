package com.webshop.demo.Controller;

import com.webshop.demo.Model.Product;
import com.webshop.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("prod", productService.listAll());

        return ("index");

    }

    @GetMapping("/create")
    public String create() {
        return("/create");
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product prod) {
        productService.create(prod);
        return "redirect:/";
    }


}