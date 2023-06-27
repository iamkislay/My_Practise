package com.learn_9.code;

public class MiisingNumber {
	   public static int missingNumber(int[] num) {
			//	int sum=num.length*(num.length+1)/2;
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

/*
 * public static int missingNum(int[] num,int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		int ans=helper(num,sum,n);
		return ans;
	}
	public static int  helper(int[] nums,int sums,int n) {
		if(n==1) {
			return sums;
		}
		sums=helper(nums,sums,n-1)-nums[n-2];
		return sums;
	}
	public static void main(String[] args) {
		int[] num= {2,4,1,5,3,7};
		int n=7;
		System.out.println(missingNum(num,n));
	}*/
 