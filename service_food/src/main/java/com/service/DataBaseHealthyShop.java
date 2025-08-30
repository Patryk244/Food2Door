package com.service;

import java.util.HashMap;

public class DataBaseHealthyShop implements ServiceDataBaseProducent {
    @Override
    public HashMap<String, Product> ListProductsOfRestaurant() {
        HashMap<String, Product> productList = new HashMap<>();
        productList.put("Quinoa Salad", new Product("Quinoa Salad", 18.0,
                KindOfProduct.Appetizers));
        productList.put("Avocado Toast", new Product("Avocado Toast", 16.5,
                KindOfProduct.Appetizers));
        productList.put("Grilled Vegetables", new Product("Grilled Vegetables", 14.0,
                KindOfProduct.SideDishes));
        productList.put("Brown Rice", new Product("Brown Rice", 12.0,
                KindOfProduct.SideDishes));
        productList.put("Fruit Bowl", new Product("Fruit Bowl", 11.0,
                KindOfProduct.Desserts));
        productList.put("Chia Pudding", new Product("Chia Pudding", 13.0,
                KindOfProduct.Desserts));
        productList.put("Fresh Smoothie", new Product("Fresh Smoothie", 15.0,
                KindOfProduct.Beverages));
        productList.put("Herbal Tea", new Product("Herbal Tea", 9.0,
                KindOfProduct.Beverages));
        return productList;
    }
}
