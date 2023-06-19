package learn_5.leetCode;

/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
  Find the missing element*/

public class problem_4 {
	static int missingNumber(int array[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        return findMissing(array, 0, expectedSum);
    }

    static int findMissing(int array[], int index, int expectedSum) {
        if (index == array.length) {
            return expectedSum;
        }

        int currentSum = 0;
        for (int i = index; i < array.length; i++) {
            currentSum += array[i];
        }

        return expectedSum - currentSum;
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 5 ,7,8,6};
        int n = 8;
        System.out.println(missingNumber(array, n));
    }


}
