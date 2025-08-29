package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {
    private RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    void TestOne(){
        assertEquals("I", romanNumerals.convert(1));
    }
    @Test
    void TestFive(){
        assertEquals("V", romanNumerals.convert(5));
    }
    @Test
    void TestTen(){
        assertEquals("X", romanNumerals.convert(10));
    }
    @Test
    void TestFour(){
        assertEquals("IV", romanNumerals.convert(4));
    }
    @Test
    void TestNine(){
        assertEquals("IX", romanNumerals.convert(9));
    }
    @Test
    void TestForty(){
        assertEquals("XL", romanNumerals.convert(40));
    }
    @Test
    void TestFifty(){
        assertEquals("L", romanNumerals.convert(50));
    }
    @Test
    void TestNinety(){
        assertEquals("XC", romanNumerals.convert(90));
    }
    @Test
    void TestHundred(){
        assertEquals("C", romanNumerals.convert(100));
    }
    @Test
    void TestFourHundred(){
        assertEquals("CD", romanNumerals.convert(400));
    }
    @Test
    void TestFiveHundred(){
        assertEquals("D", romanNumerals.convert(500));
    }
    @Test
    void TestNineHundred(){
        assertEquals("CM", romanNumerals.convert(900));
    }
    @Test
    void TestThousand(){assertEquals("M", romanNumerals.convert(1000));}
    @Test
    void TestComplex(){
        assertEquals("MCMXCIV", romanNumerals.convert(1994));
    }
}
