package com.learn_3.code.conversion;

public class decimal_to_binary {
	public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Base case
        }

        return decimalToBinaryRecursive(decimal);
    }

    private static String decimalToBinaryRecursive(int decimal) {
        if (decimal == 0) {
            return ""; // Base case
        }

        int remainder = decimal % 2;
        String binary = decimalToBinaryRecursive(decimal / 2); 

        return binary + remainder; 
    }

    public static void main(String[] args) {
        int decimal = 56; 
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation of " + decimal + ": " + binary);
    }
}
