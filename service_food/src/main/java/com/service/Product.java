package com.service;

public class Product {
    private String productName;
    private double price;
    private KindOfProduct kindOfProduct;

    public Product(String productName, double price, KindOfProduct kindOfProduct) {
        this.productName = productName;
        this.price = price;
        this.kindOfProduct = kindOfProduct;
    }

    @Override
    public String toString() {
        return "Product name: " + productName + ", price: " + price + ", kind of product: " + kindOfProduct;
    }

    public double getPrice() {
        return price;
    }
}
