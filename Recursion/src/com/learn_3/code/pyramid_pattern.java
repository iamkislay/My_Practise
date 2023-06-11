package com.learn_3.code;

public class pyramid_pattern {
	
	public static void PyramidPattern(int size) {
        PyramidRecursive(size, size);
    }

    private static void PyramidRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Blank(size,row,size); 
        System.out.println(); 
       PyramidRecursive(size, row - 1); 
    }

    private static void Blank(int count,int row,int max) {
        if (count == max-row+1) {
        	stars(count);
            return; // Base case
        }

        System.out.print(" "); 
        Blank(count - 1,row,max); 
    }
    private static void stars(int count) {
    	if(count==0) {
    		return;
    	}
    	System.out.print("*");
    	System.out.print(" ");
    	stars(count-1);
    }

    public static void main(String[] args) {
        int size = 7; 
        PyramidPattern(size);
    }
}
