package com.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface ServicesProducent {
    void process(User user);
    ArrayList<Product> addProduct(String key, int quantity);
}

