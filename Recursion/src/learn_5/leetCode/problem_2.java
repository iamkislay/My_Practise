package learn_5.leetCode;

/*Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.*/

public class problem_2 {
	public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
        System.out.println(isPowerOfFour(91));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n < 1 || n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }

}
