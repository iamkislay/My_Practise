package com.learn_3.code.conversion;

public class decimal_to_octal {
	public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0"; // Base case
        }

        return decimalToOctalRecursive(decimal);
    }

    private static String decimalToOctalRecursive(int decimal) {
        if (decimal == 0) {
            return ""; // Base case
        }

        int remainder = decimal % 8;
        String octal = decimalToOctalRecursive(decimal / 8); 

        return octal + remainder; 
    }

    public static void main(String[] args) {
        int decimal = 10; 
        String octal = decimalToOctal(decimal);
        System.out.println("Binary representation of " + decimal + ": " + octal);
    }
}
