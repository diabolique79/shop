package com.shop.app.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class ProductController {

    private RepositoryProducts repositoryProducts;

    public ProductController(RepositoryProducts repositoryProducts) {
        this.repositoryProducts = repositoryProducts;
    }


    @GetMapping("/spozywcze.html")
    @ResponseBody
    public String getAll() {
        String result = "";
        String category_name = String.valueOf(Category.CATEGORY_1.description);
        repositoryProducts.getCategory(Category.CATEGORY_1);
            ArrayList<Product> products = repositoryProducts.products;
            {
                for (Product product : products) {
                    result += product.toString() + "<br>";
                }
        }
        return result;
    }


    @PostMapping("/add")
    public String addNewProduct(@RequestParam String name, @RequestParam Double price, @RequestParam Category category) {

        repositoryProducts.add(new Product(name, price, category));
        return "redirect:/products";
    }
}
