package com.learn_3.code;

public class mirror_inverted_pyramid {
	public static void printMirrorLeftPyramidPattern(int size) {
        MirrorLeftPyramidRecursive(size, size);
    }

    private static void MirrorLeftPyramidRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Blank(size,row); 
        System.out.println(); 
       MirrorLeftPyramidRecursive(size, row - 1); 
    }

    private static void Blank(int count,int row) {
        if (count == row) {
        	stars(count);
            return; // Base case
        }

        System.out.print(" "); 
        Blank(count - 1,row); 
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
