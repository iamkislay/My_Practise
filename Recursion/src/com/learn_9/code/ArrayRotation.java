package com.learn_9.code;
import java.util.*;


public class ArrayRotation {
	public void rotate(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            l.add(nums[i]);
        k = k%nums.length;
       for(int i=0;i<nums.length;i++){
           nums[i]=l.get((nums.length-k+i)%nums.length);
           System.out.print(nums[i]+" ");
       }
    }
	
	public static void main(String[] args) {
		int [] nums= {2,11,10,21,5};
		new ArrayRotation().rotate(nums,4);
	}
	
}
