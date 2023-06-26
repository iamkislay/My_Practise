package com.learn_7.code;

import java.util.ArrayList;
import java.util.List;

public class NumPermute {
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums,curr,ans);
        return ans;
    }
	
    public static void backtrack(int[] nums,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int n:nums){
            if(!curr.contains(n)) {
            	curr.add(n);
            	backtrack(nums,curr,ans);
            	curr.remove(curr.size()-1);
            }
        }
    }
    public static void main(String[]args) {
    	int[] nums= {1,2,3};
    	System.out.print(permute(nums));
    }
}
