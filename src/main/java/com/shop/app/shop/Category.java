package com.shop.app.shop;

public enum Category {

    CATEGORY_1("Art. spożywcze"),

    CATEGORY_2("Art. gosp. domowego"),

    CATEGORY_3("Inne");

    public final String description;

    Category(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
