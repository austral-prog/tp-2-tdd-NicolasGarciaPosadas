package com.tp2.roman;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    
    public String convert(int number) {
       String result = "";
       if (number <= 0 && number >= 3999) {
           return "Invalid Roman Numeral";
       }
       int[] Values= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
       String[] Digits={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       for (int i=0; i<Values.length; i++){
           while (number >= Values[i]){
               result += Digits[i];
               number -= Values[i];
           }
       }
       return result;
    }
}
