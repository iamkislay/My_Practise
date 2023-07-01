package com.assign_1;

public class Question2 {
	static int findAnswer(int n,int x,int count) {
		if(x==-1) {
			return 0;
		}
		count+=findAnswer(n,x-1,count);
		if((n&x)==x)
			count++;
		return count;
	}
	public static void main(String[] args) {
		int num= 5;
		System.out.println("Count of such numbers are is : "+findAnswer(num,num,0));
	}
}
