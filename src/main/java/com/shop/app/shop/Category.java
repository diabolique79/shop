package com.shop.app.shop;

public enum Category {

    SPOZYWCZE("Art. spożywcze"),

    DOMOWE("Art. gosp. domowego"),

    INNE("Inne");

    public final String description;

    Category(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
