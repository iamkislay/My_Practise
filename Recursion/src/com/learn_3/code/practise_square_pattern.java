package com.learn_3.code;

public class practise_square_pattern {
	
	public static void printSquarePattern(int size) {
        SquareRecursive(size, size);
    }

    private static void SquareRecursive(int size, int row) {
        if (row == 0) {
            return; // Base case
        }

        Stars(size); 
        System.out.println(); 
        SquareRecursive(size, row - 1); 
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
