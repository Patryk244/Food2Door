package com.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestValidateBaskets {

    @Test
    public void testValidateBaskets() {
        boolean resultPositive = ValidateBaskets.EqualsNotZeroOrGreaterThanZero(1);
        boolean resultNegative1 = ValidateBaskets.EqualsNotZeroOrGreaterThanZero(-1);
        boolean resultNegativeForZero = ValidateBaskets.EqualsNotZeroOrGreaterThanZero(0);
        assertTrue(resultPositive, String.valueOf(true));
        assertFalse(resultNegative1, String.valueOf(false));
        assertFalse(resultNegativeForZero, String.valueOf(false));
    }
}
