package com.shop.app.shop;

import org.springframework.stereotype.Component;


public class Product {

    String name;
    Double price;
    Category category;

    public Product(String name, Double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return   "Nazwa produktu: " + name  + ", cena produktu: " + price + " zł "+
                category.description ;
    }
}
