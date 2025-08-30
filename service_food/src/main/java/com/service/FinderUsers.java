package com.service;

import java.util.HashMap;

public class FinderUsers {
    private static ServiceDataBaseUser callUsers = new DataBaseUsers();
    private static HashMap<String,User> listOfUsers = callUsers.databaseForUsers();

    public static boolean findUsersByEmail(String email) {
        boolean found = listOfUsers.entrySet().stream()
                .anyMatch(entry -> entry.getKey().equals(email));
        if (!found) {
            System.out.println("User not found");
        }
        return found;
    }
}
