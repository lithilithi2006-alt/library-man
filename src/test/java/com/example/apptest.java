package com.library;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFineCalculation() {
        int days = 10;
        int allowedDays = 7;
        int expectedFine = (days - allowedDays) * 10;

        assertEquals(30, expectedFine);
    }
}