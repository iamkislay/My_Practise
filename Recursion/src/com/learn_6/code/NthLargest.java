package com.learn_6.code;
import java.util.*; 

public class NthLargest {
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[] {8,12,12,10,5,11,1,9};
		System.out.println("Enter n :");
		int n = sc.nextInt();
		sc.close();
		nthLargest(arr,n,999999999);
		System.out.println(""+n+"th Largest no is:"+answer);
		
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
