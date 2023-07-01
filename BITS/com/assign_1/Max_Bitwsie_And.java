package com.assign_1;


public class Max_Bitwsie_And {
	static int maxBitwise(int [] num,int n,int maxBitAnd) {
		if (n == num.length) {
            return maxBitAnd;
        }

        for (int i = n + 1; i < num.length; i++) {
            int bitwiseAND = num[n] & num[i];
            if (bitwiseAND > maxBitAnd) {
                maxBitAnd = bitwiseAND;
            }
        }

        return maxBitwise(num, n + 1, maxBitAnd);
    }
	
	
	public static void main(String[] args) {
		int[] num= {3,5,8,10,12};
		System.out.println("Max Bitwise sum is : "+maxBitwise(num,0,0));
	}
		
}

