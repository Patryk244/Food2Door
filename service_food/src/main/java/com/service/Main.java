package com.service;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Smith", "JohnSmith@gmail.com");
        ServicesProducent servicesProducent1 = new ExtraFoodShop();
        servicesProducent1.addProduct("Soup of the day", 2);
        servicesProducent1.addProduct("French Fries", 1);
        servicesProducent1.addProduct("Coffee", 1);
        servicesProducent1.process(user1);

        User user2 = new User("David", "Lee", "DavidLee@gmail.com");
        ServicesProducent servicesProducent2 = new HealthyShop();
        servicesProducent2.addProduct("Chia Pudding", 1);
        servicesProducent2.addProduct("Gluten-Free Pasta", 2);
        servicesProducent2.addProduct("Lemonade", 1);
        servicesProducent2.process(user2);

        User user3 = new User("Laura", "Green", "LauraGreen@gmail.com");
        ServicesProducent servicesProducent3 = new GlutenFreeShop();
        servicesProducent3.addProduct("Zucchini Fries", 1);
        servicesProducent3.addProduct("Fresh Orange Juice", 1);
        servicesProducent3.addProduct("Almond Cake", 1);
        servicesProducent3.process(user3);

    }
}
