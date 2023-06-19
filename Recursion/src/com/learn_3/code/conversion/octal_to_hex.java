package com.learn_3.code.conversion;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class octal_to_hex {
	static int count=0;
	   

    public static String convert(int n) {
        // your solutions goes here..
        if (n == 0) {
            return "0"; // Base case
        }

        return decimalToHexRecursive(convertOctToDec(n));
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
    public static  int convertOctToDec(int Oct){
        if(Oct==0){
            return 0;
        }
        
        return (Oct%10) *(int)Math.pow(8,count++) + convertOctToDec(Oct/10);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        System.out.println(convert(n));
}

}
