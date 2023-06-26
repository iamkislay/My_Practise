package com.learn_9.code;

public class ArrayAddition {
	public int[] addArray(int []a,int []b) {
		int[] result=new int[a.length];
		helper(result,a,b,a.length,a.length);
		return result;
	}
	
	public int helper(int[] result,int[]a,int[] b,int len,int n) {
		if(n==1) {
			result[result.length-1]=(a[len-1]+b[len-1])%10;
			return result[result.length-1]/10;
		}
		int carry=helper(result,a,b,len,n-1);
		result[result.length-n]=((a[len-n]+b[len-n])%10)+carry;
		return (a[len-n]+b[len-n]+carry)/10;
	}
	public static void main(String[] args) {
		int[] a= {2,1,4,2};
		int[] b= {1,2,7,4};
		int []ans= new ArrayAddition().addArray(a, b);
		for(int k :ans) {
			System.out.print(k+" ");
		}
	}
}
