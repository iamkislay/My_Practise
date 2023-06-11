package com.learn_1.code;

import java.util.Scanner;

public class practise_3{
	public static int findHighestElement(int[] array) {
        return HighestElementRecursive(array, 0, array.length - 1);
    }

    private static int HighestElementRecursive(int[] array, int start, int end) {
        if (start == end) {
            return array[start]; // Base case
        }

        int mid = (start + end) / 2;
        int lMax = HighestElementRecursive(array, start, mid);
        int rMax = HighestElementRecursive(array, mid + 1, end); 
        
        return Math.max(lMax, rMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] ar = new int[6];
		for(int i=0;i<6;i++) {
			ar[i]=sc.nextInt();
		}
        int highestElement = findHighestElement(ar);
        System.out.println("The highest element is: " + highestElement);
    }
}
