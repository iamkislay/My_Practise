package com.learn_3.code;

public class left_pyramid_pattern {
	public static void printLeftPyramidPattern(int size) {
        LeftPyramidRecursive(size, size);
    }

    private static void LeftPyramidRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Stars(size-row+1); 
        System.out.println(); 
        LeftPyramidRecursive(size, row - 1); 
    }

    private static void Stars(int count) {
        if (count == 0) {
            return; // Base case
        }

        System.out.print("*"); 
        Stars(count - 1); 
    }

    public static void main(String[] args) {
        int size = 6; 
        printLeftPyramidPattern(size);
    }
}
