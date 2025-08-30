package com.service;

public class ValidateBaskets {
    public static boolean EqualsNotZeroOrGreaterThanZero(int number) {
        if (number > 0) {
            return true;
        } else {
            System.err.println("Please enter a positive number");
            return false;
        }
    }
}
