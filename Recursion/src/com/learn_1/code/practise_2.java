package com.learn_1.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practise_2 {
	public static ArrayList<String> capitalizeRecursive(String[] words) {
        if (words.length == 0) {
            return new ArrayList<>(); // Base case
        }

        // Capitalize the first word in the array
        String capitalizedWord = capitalize(words[0]);

        
        String[] remainingWords = Arrays.copyOfRange(words, 1, words.length);
        ArrayList<String> capitalizedWords = capitalizeRecursive(remainingWords);

        
        capitalizedWords.add(0, capitalizedWord);
        return capitalizedWords;
    }

    private static String capitalize(String word) {
        if (word.isEmpty()) {
            return word; 
        }
        return word.toUpperCase();
    }
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[3];
		for(int i=0;i<3;i++) {
			a[i]=sc.next();
		}
		
        ArrayList<String> capitalizedWords = capitalizeRecursive(a);
        System.out.println(capitalizedWords);
	}
	
}
