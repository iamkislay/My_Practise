package com.learn_6.code;

public class thirdLargest {
	static int answer;
	public static void main(String[] args) {
		int[] arr=new int[] {8,12,12,10,5,11,1,9};
		nthLargest(arr,3,999999999);
		System.out.println("Third Largest no is:"+answer);
		
	}
	static void nthLargest(int []a,int n,int temp) {
		if(n==0) {
			answer=temp;
			return ;
		}
		int max = a[0];
        for(int i = 1 ; i<a.length; i++){
            if(a[i]>max && a[i]<temp){
                max = a[i];
            }
            
        }
        temp=max;
        nthLargest(a,n-1,temp);
        return;
	}
}
