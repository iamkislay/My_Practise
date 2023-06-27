package com.learn_9.code;

public class ArraySubstraction {
	public int[] subArray(int []a,int []b) {
		int[] result=new int[a.length];
		helper(result,a,b,a.length,a.length);
		return result;
	}
	
	public void helper(int[] result,int[]a,int[] b,int len,int n) {
		if(n==1) {
			result[result.length-1]=(a[len-1]-b[len-1]);
			return;
		}
		helper(result,a,b,len,n-1);
		result[result.length-n]=(a[len-n]-b[len-n]);
		return;
	}
	public static void main(String[] args) {
		int[] a= {2,1,4,2};
		int[] b= {1,2,7,4};
		int []ans= new ArraySubstraction().subArray(a, b);
		boolean flag=true;
		for(int i=ans.length-1;i>=0;i--) {
			if( ans[i]>0 && !flag) {
				ans[i]=ans[i]-1;
				flag=true;
			}
			if(ans[i]<0) {
				ans[i]=10+ans[i];
				if(!flag) {
					ans[i]=ans[i]-1;
				}
				flag=false;
			}
		}
		for (int k:ans) {
			System.out.print(k+" ");
		}
	}
}
