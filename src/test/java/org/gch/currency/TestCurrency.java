package org.gch.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurrency {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.time(2);
        assertEquals(10, five.amount);
    }

}
