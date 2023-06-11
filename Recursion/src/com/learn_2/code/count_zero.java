package com.learn_2.code;

public class count_zero {
	static int czero(int num) { // Stack falling approach
		if(num==0) {
			return 0;
		}
		int count = czero(num/10);
		int digit=num%10;
		if(digit==0)
			count++;
		return count;
	}
	
	static void czero(int num,int count) { // Stack building approach
		if(num==0) {
			System.out.println("Using Stack Building void:  "+count);
			return;
		}
		int digit=num%10;
		if(digit==0)
			count++;
		czero(num/10,count);
		
		return;
	}
	
	public static void main(String[] args) {
		System.out.println("Using Stack falling return type:  "+czero(202000300));
		czero(202000300,0);
	}
}
