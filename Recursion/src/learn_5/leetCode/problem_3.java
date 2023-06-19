package learn_5.leetCode;
/*Your task is to calculate ab mod 1337 where a 
  is a positive integer and b is an extremely large positive 
   integer given in the form of an array.*/


import java.util.Arrays;

public class problem_3 {
	public static final int base = 1337;

    public static void main(String[] args) {
        int[] arr = { 0, 5 };
        int num = 2;
        System.out.println(superPow(num, arr));
    }

    public static int superPow(int a, int[] b) {
        if (b.length == 0)
            return 1;
        int last = b[b.length - 1];
        int[] next = Arrays.copyOfRange(b, 0, b.length - 1);
        int p1 = power(a, last);
        int p2 = power(superPow(a, next), 10);
        return (p1 * p2) % base;
    }

    private static int power(int a, int b) {
        if (b == 0)
            return 1;
        a %= base;
        if (b % 2 == 0) {
            int res = power(a, b / 2);
            return (res * res) % base;
        } else {
            return (a * power(a, b - 1)) % base;
        }
    }

}
