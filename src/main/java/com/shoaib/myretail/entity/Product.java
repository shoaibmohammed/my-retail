package com.shoaib.myretail.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection="products")
public class Product {

    public Product(long id, Map<String, String> current_price) {
        this.id = id;
        this.current_price = current_price;
    }

    @Id
    long id;

    @Transient
    public String title;

    public Map<String, String> current_price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, String> getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(Map<String, String> current_price) {
        this.current_price = current_price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
