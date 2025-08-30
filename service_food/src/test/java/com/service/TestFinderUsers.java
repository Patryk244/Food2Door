package com.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFinderUsers {

    @Test
    public void userIsFind() {
        boolean found = FinderUsers.findUsersByEmail("LauraGreen@gmail.com");
        assertTrue(found, String.valueOf(true));
    }
}