package com.shop.app.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryProducts {

    ArrayList<Product> products = new ArrayList<>();

    public RepositoryProducts(){

        products.add(new Product("mleko", 2.59, "spozywcze"));
        products.add(new Product("jajka", 6.42, "spozywcze"));
        products.add(new Product("masło", 5.20, "spozywcze"));
        products.add(new Product("płyn do naczyń", 3.90, "domowe"));
        products.add(new Product("kostki wc", 3.99, "domowe"));
        products.add(new Product("gąbki", 1.59, "domowe"));
        products.add(new Product("ścierki", 2.59, "domowe"));
        products.add(new Product("żel pod prysznic", 2.59, "inne"));
        products.add(new Product("mydło", 2.59, "inne"));
    }


    public ArrayList<Product> getProducts(){

        return products;
    }

    public void add(Product product){

        products.add(product);
    }

}
