package com.learn_7.code;

import java.util.*;


public class GenerateParanthsis {
	
	public static void main(String[] args) {
		
        List<String> result = generateParan(4);
        System.out.println(result);
        
    }

	
	static List<String> generateParan(int n){
		ArrayList<String> result = new ArrayList<>();
        makeParanthesis(result, 0, 0,"", n);
        return result;
	}
	static void makeParanthesis(List<String> result ,int open,int close,String p,int target) {
		if(p.length()==target*2) {
			result.add(p);
			return ;
		}
		if(open <target) {
			makeParanthesis(result,open+1,close,p+"(",target);
		}
		if(close<open) {
			makeParanthesis(result,open,close+1,p+")",target);
		}
		return;
	}
}
