package com.service;

import java.util.HashMap;

public class DataBaseExtraFoodShop implements ServiceDataBaseProducent {
    @Override
    public HashMap<String, Product> ListProductsOfRestaurant() {
        HashMap<String, Product> productList = new HashMap<>();
        productList.put("Soup of the day", new Product("Soup of the day", 12.5,
                KindOfProduct.Appetizers));
        productList.put("Spring rolls", new Product("Spring rolls", 15.5,
                KindOfProduct.Appetizers));
        productList.put("French Fries", new Product("French Fries", 8.0,
                KindOfProduct.SideDishes));
        productList.put("Mashed Potatoes", new Product("Mashed Potatoes", 10.0,
                KindOfProduct.SideDishes));
        productList.put("Ice Cream", new Product("Ice Cream", 9.5,
                KindOfProduct.Desserts));
        productList.put("Cheesecake", new Product("Cheesecake", 14.0,
                KindOfProduct.Desserts));
        productList.put("Coffee", new Product("Coffee", 7.5,
                KindOfProduct.Beverages));
        productList.put("Cola", new Product("Cola", 6.0,
                KindOfProduct.Beverages));
        return productList;
    }
}
