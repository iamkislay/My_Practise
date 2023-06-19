package learn_5.leetCode;

/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.*/

public class problem_1 {
	public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(33));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n < 1 || n % 3 != 0)
            return false;
        return isPowerOfThree(n / 3);
    }

}
