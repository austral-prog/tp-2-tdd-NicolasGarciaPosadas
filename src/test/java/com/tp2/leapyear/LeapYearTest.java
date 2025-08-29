
package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @Test
    void year2000_isLeapYear() {
        assertTrue(leapYear.isLeapYear(2000));
    }
    @Test
    void year1900_isLeapYear() {
        assertFalse(leapYear.isLeapYear(1900));
    }
    @Test
    void year2004_isLeapYear() {
        assertTrue(leapYear.isLeapYear(2004));
    }
    @Test
    void year2001_isLeapYear() {
        assertFalse(leapYear.isLeapYear(2001));
    }
}
