package com.learn_1.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practise_4 {
	static ArrayList<Integer> addTaxRecursive (int[] array){
		if(array.length==0) {
			return new ArrayList<>();
		}
		int tax=array[0]*10/100;
		int[] remaining = Arrays.copyOfRange(array, 1, array.length);
	    ArrayList<Integer> taxIncluded = addTaxRecursive(remaining);

	     
	    taxIncluded.add(0, array[0]+tax);
	    return taxIncluded;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();
		}
		ArrayList<Integer> taxIncluded = addTaxRecursive(ar);
		System.out.println("Salary after tax included"+ taxIncluded);
	}
	
}
