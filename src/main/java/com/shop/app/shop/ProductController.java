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
        ArrayList<Product> products = repositoryProducts.products;
        {
            for (Product product : products) {
                String categoryName = String.valueOf(product.getCategory());


                if (category == null || categoryName == category) {
                    result += product.toString() + "<br>";
                }
                sum += product.getPrice();

            }
        }
        return result + " " + sum;
    }

    @GetMapping("/lista?kategoria=spozywcze")
    @ResponseBody
    public String getSpozywcze(@RequestParam(value = "kategoria") String category) {
        String result = "";
        double sum = 0;
        ArrayList<Product> products = repositoryProducts.products;
        {
            for (Product product : products) {
                String categoryName = "spozywcze";
                if (category.equals("spozywcze")) {
                    result += product.toString() + "<br>";
                }
                sum += product.getPrice();
            }
        }
        return result + " " + sum;
    }
    @PostMapping("/add")
    public String addNewProduct(@RequestParam String name, @RequestParam double price, @RequestParam String category) {

        repositoryProducts.add(new Product(name, price, category));
        return "redirect:/products";
    }
}
