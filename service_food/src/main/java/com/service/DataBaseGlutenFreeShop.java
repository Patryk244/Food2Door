package com.service;

import java.util.HashMap;

public class DataBaseGlutenFreeShop implements ServiceDataBaseProducent{
    @Override
    public HashMap<String, Product> ListProductsOfRestaurant() {
        HashMap<String, Product> productList = new HashMap<>();
        productList.put("Gluten-Free Bread", new Product("Gluten-Free Bread", 10.5,
                KindOfProduct.SideDishes));
        productList.put("Gluten-Free Pasta", new Product("Gluten-Free Pasta", 14.0,
                KindOfProduct.SideDishes));
        productList.put("Stuffed Mushrooms", new Product("Stuffed Mushrooms", 17.0,
                KindOfProduct.Appetizers));
        productList.put("Zucchini Fries", new Product("Zucchini Fries", 13.5,
                KindOfProduct.Appetizers));
        productList.put("Almond Cake", new Product("Almond Cake", 15.0,
                KindOfProduct.Desserts));
        productList.put("Coconut Cookies", new Product("Coconut Cookies", 12.0,
                KindOfProduct.Desserts));
        productList.put("Fresh Orange Juice", new Product("Fresh Orange Juice", 10.0,
                KindOfProduct.Beverages));
        productList.put("Lemonade", new Product("Lemonade", 8.5,
                KindOfProduct.Beverages));
        return productList;
    }
}
