package com.learn_3.code;

public class Mirror_left_pyramid {
	public static void printMirrorLeftPyramidPattern(int size) {
        MirrorLeftPyramidRecursive(size, size);
    }

    private static void MirrorLeftPyramidRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Blank(size,row,size); 
        System.out.println(); 
       MirrorLeftPyramidRecursive(size, row - 1); 
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
    	stars(count-1);
    }

    public static void main(String[] args) {
        int size = 7; 
        printMirrorLeftPyramidPattern(size);
    }
}
