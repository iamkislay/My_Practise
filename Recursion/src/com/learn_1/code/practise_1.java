package com.learn_1.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practise_1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a= new ArrayList<>();
		for(int i=0;i<10;i++) {
			a.add(sc.nextInt());
		}
		practise_1 p=new practise_1();
		System.out.print("Product of numbers is "+p.productOfNumbers(a));
	}
	long productOfNumbers(List<Integer> list) {
		if(list.size()==0) {
			return 1;
		}
		return list.get(0)*productOfNumbers(list.subList(1,list.size()));
	}
}
