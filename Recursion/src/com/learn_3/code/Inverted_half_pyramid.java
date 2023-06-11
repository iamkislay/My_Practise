package com.learn_3.code;

public class Inverted_half_pyramid {
	public static void printInvertedPyramidPattern(int size) {
        InvertedPyramidRecursive(size, size);
    }

    private static void InvertedPyramidRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Stars(size); 
        System.out.println(); 
        InvertedPyramidRecursive(size-1, row - 1); 
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
        printInvertedPyramidPattern(size);
    }
}
