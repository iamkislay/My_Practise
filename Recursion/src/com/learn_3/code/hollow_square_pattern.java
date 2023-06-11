package com.learn_3.code;

public class hollow_square_pattern {
	public static void printSquarePattern(int size) {
        hollowSquareRecursive(size, size);
    }

    private static void hollowSquareRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }
        if(row==size || row==1)
            Stars(size); 
        else
        	blank(size,size);
        System.out.println(); 
        hollowSquareRecursive(size, row - 1); 
    }
    private static void blank(int count,int size) {
    	if(count==0) {
    		return;
    	}
    	if(count==size || count==1)
    		System.out.print("* ");
    	else
    		System.out.print("  ");
    	blank(count-1,size);
    }

    private static void Stars(int count) {
        if (count == 0) {
            return; // Base case
        }

        System.out.print("* "); 
        Stars(count - 1); 
    }

    public static void main(String[] args) {
        int size = 6; 
        printSquarePattern(size);
    }
}
