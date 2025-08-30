package com.service;

import java.util.ArrayList;
import java.util.HashMap;

public class ExtraFoodShop implements ServicesProducent {
    ArrayList<Product> basket = new ArrayList<>();
    ServiceDataBaseProducent extraShop = new DataBaseExtraFoodShop();


    public ArrayList<Product> addProduct(String key, int quantity) {
        if (!ValidateBaskets.EqualsNotZeroOrGreaterThanZero(quantity)) {
            return basket;
        }
        HashMap<String, Product> listAvailableProduct = extraShop.ListProductsOfRestaurant();
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
        makeOrderByYser(userIsFound, user);
    }

    private void makeOrderByYser(boolean userIsFound, User user) {
        if (userIsFound) {
            System.out.println("User name is: " + user.getName());
            System.out.println("Ordered: ");
            for (Product product : basket) {
                System.out.println(product);
            }
        }
    }
}