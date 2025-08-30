package com.service;

import java.util.HashMap;

public class DataBaseUsers implements ServiceDataBaseUser {
    private HashMap<String,User> listOfUsers = new HashMap<>();
    @Override
    public HashMap<String, User> databaseForUsers() {
        listOfUsers.put("JohnSmith@gmail.com", new User("John", "Smith", "JohnSmith@gmail.com"));
        listOfUsers.put("AnnaKowalska@gmail.com", new User("Anna", "Kowalska", "AnnaKowalska@gmail.com"));
        listOfUsers.put("MichaelBrown@gmail.com", new User("Michael", "Brown", "MichaelBrown@gmail.com"));
        listOfUsers.put("LauraGreen@gmail.com", new User("Laura", "Green", "LauraGreen@gmail.com"));
        listOfUsers.put("DavidLee@gmail.com", new User("David", "Lee", "DavidLee@gmail.com"));
        return listOfUsers;
    }
}
