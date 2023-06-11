package com.learn_3.code.conversion;

public class binary_to_decimal {
	static int count=0;
	
	public static int binaryToDecimal(String binary) {
        if (binary == "") {
            return 0; // Base case
        }

        return binaryToDecimalRecursive(binary.charAt(binary.length()-1),binary,binary.length()-1);
    }

    private static int binaryToDecimalRecursive(char binary,String Binary,int length) {
        if (length==0) {
            return (binary-'0') *(int)Math.pow(2, count++) ; // Base case
        }

        return (binary-'0') *(int)Math.pow(2, count++) + binaryToDecimalRecursive(Binary.charAt(length),Binary,length-1); 

      
    }

    public static void main(String[] args) {
        String binary = "1111"; 
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal representation of " + binary + ": " + decimal);
    }
}
