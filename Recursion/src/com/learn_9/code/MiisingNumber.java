package com.learn_9.code;

public class MiisingNumber {
	   public static int missingNumber(int[] num) {
				return helper(num,1);
			}
			public static int  helper(int[] nums,int n) {
				if(n==nums.length+1) {
					return n*(n+1)/2 ;
				}
				int sums=helper(nums,n+1)-nums[n-1];
				return sums;
			}
	public static void main(String[] args) {
		int[] num= {2,4,1,3,6};
		System.out.println(missingNumber(num));
	}
}
