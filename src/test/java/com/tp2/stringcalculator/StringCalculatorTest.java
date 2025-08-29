package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {
    private StringCalculator stringCalculator = new StringCalculator();
    @Test
    void Test(){
        assertEquals(2,stringCalculator.add("2"));
    }
    @Test
    void Test2(){assertEquals(5,stringCalculator.add("2,3"));}
    @Test
    void Test3(){assertEquals(10,stringCalculator.add("2,3\n5"));}
    @Test
    void Test4(){assertEquals(0,stringCalculator.add(""));}
    @Test
    void Test5(){assertEquals(27,stringCalculator.add("2,5,20"));}
    @Test
    void Test6(){assertThrows(IllegalArgumentException.class,()->stringCalculator.add("2,5,-20"));}

}
