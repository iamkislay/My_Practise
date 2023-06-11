package com.learn_2.code;

public class power_of_number {
	
	
	static int pom(int num,int ex) { // stack falling return approach
		if(ex==0) {
			return 1;
		}
		int result=pom(num,ex-1);
		result=result*num;
		return result;
	}
	
	
	static void pom(int num,int ex,int results) { // stack building void approach
		if(ex==0) {
			System.out.println("Stack building : "+results);
			return ;
		}
		results=results*num;
		pom(num,ex-1,results);
		
		return;
	}
	
	public static void main(String[]args) {
		System.out.println("Stack falling  : "+pom(2,5));
		pom(2,5,1);
	}
}
