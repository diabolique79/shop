package com.shop.app.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositoryProducts {

    ArrayList<Product> products = new ArrayList<>();

    public RepositoryProducts(){

        products.add(new Product("mleko", 2.59, Category.CATEGORY_1));
        products.add(new Product("jajka", 6.42, Category.CATEGORY_1));
        products.add(new Product("masło", 5.20, Category.CATEGORY_1));
        products.add(new Product("płyn do naczyń", 3.90, Category.CATEGORY_2));
        products.add(new Product("kostki wc", 3.99, Category.CATEGORY_2));
        products.add(new Product("gąbki", 1.59, Category.CATEGORY_2));
        products.add(new Product("ścierki", 2.59, Category.CATEGORY_2));
        products.add(new Product("żel pod prysznic", 2.59, Category.CATEGORY_3));
        products.add(new Product("mydło", 2.59, Category.CATEGORY_3));
    }


    public ArrayList<Product> getProducts(){

        return products;
    }

    public void add(Product product){

        products.add(product);
    }

    public void getCategory(Category category){

        category.getDescription();
    }
}
