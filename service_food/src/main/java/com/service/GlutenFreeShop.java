package com.service;

import java.util.ArrayList;
import java.util.HashMap;

public class GlutenFreeShop implements ServicesProducent {
    ArrayList<Product> basket = new ArrayList<>();
    ServiceDataBaseProducent glutenFreeShop = new DataBaseGlutenFreeShop();

    public ArrayList<Product> addProduct(String key, int quantity) {
        if (!ValidateBaskets.EqualsNotZeroOrGreaterThanZero(quantity)) {
            return basket;
        }
        HashMap<String, Product> listAvailableProduct = glutenFreeShop.ListProductsOfRestaurant();
        listAvailableProduct.entrySet().stream().forEach(product -> {
            if (product.getKey().equals(key)) {
                for (int i = 0; i < quantity; i++) {
                    basket.add(product.getValue());
                }
            } else if (listAvailableProduct.size() == quantity) {
                System.out.println("Product not found");
            }
        });
        return basket;
    }

    @Override
    public void process(User user) {
        boolean userIsFound = FinderUsers.findUsersByEmail(user.getEmail());
        makeOrderByUser(userIsFound, user);
    }

    private void makeOrderByUser(boolean userIsFound, User user) {
        if (userIsFound) {
            System.out.println("GlutenFreeShop order created for user: " + user.getName());
            System.out.println("Ordered: ");
            for (Product product : basket) {
                System.out.println(product);
            }
        }
    }
}
