package com.learn_3.code.conversion;

public class decimal_to_hex {
	public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "0"; // Base case
        }

        return decimalToHexRecursive(decimal);
    }

    private static String decimalToHexRecursive(int decimal) {
        if (decimal == 0) {
            return ""; // Base case
        }

        int remainder = decimal % 16;
        
        String hex = decimalToHexRecursive(decimal / 16); 

        if (remainder < 10) {
            return hex + remainder;
        } else {
            char hexChar = (char) ('A' + (remainder - 10));
            return hex + hexChar; 
        }
    }

    public static void main(String[] args) {
        int decimal = 14; 
        String hex = decimalToHex(decimal);
        System.out.println("Binary representation of " + decimal + ": " + hex);
    }
}
