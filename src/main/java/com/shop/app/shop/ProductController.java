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


    @GetMapping("/lista")
    @ResponseBody
    public String getAll(@RequestParam(value = "kategoria", required = false) String category) {

        String result = "";
        double sum = 0;
        ArrayList<Product> products = repositoryProducts.getProducts();
        {
            for (Product product : products) {

                if (category == null || product.getCategory().equals(category)) {
                    result += product.toString() + "<br>";
                    sum += product.getPrice();
                }

            }
        }result += "Cena: " + sum + " zł";


        return result;
    }


    @PostMapping("/add")
    public String addNewProduct(@RequestParam String name, @RequestParam double price, @RequestParam String category) {
        repositoryProducts.add(new Product(name, price, category));
        return "redirect:/lista";
    }
}
