package com.learning.firstSpringApp.model;


import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;
    private String prodName;
    private int price;

    public Product() {
    }

    public Product(int id, String prodName, int price) {
        this.id = id;
        this.prodName = prodName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
