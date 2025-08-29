package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        int result = 0;
        StringBuilder numero = new StringBuilder();

        for (char c : numbers.toCharArray()) {
            if (c != ',' && c != '\n') {
                numero.append(c);
            } else {
                if (numero.length() > 0) {
                    int sumable = Integer.parseInt(numero.toString());
                    if (sumable < 0) throw new IllegalArgumentException();
                    result += sumable;
                    numero.setLength(0); // reset
                }
            }
        }
        if (numero.length() > 0) {
            int sumable = Integer.parseInt(numero.toString());
            if (sumable < 0) throw new IllegalArgumentException();
            result += sumable;
        }

        return result;
    }
}
