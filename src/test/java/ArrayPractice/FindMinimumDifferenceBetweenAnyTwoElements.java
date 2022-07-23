package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/find-minimum-difference-pair/
 */
public class FindMinimumDifferenceBetweenAnyTwoElements {
    static int minDifference(int[] arr) {

        int n = arr.length;
        int min_value = Integer.MAX_VALUE; // max value for integer.

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs((arr[i] - arr[j])) < min_value)  // abs = Returns the absolute value of an int value
                    min_value = Math.abs(arr[i] - arr[j]);
            }
        }
        return min_value;
    }

    public static void main(String[] args) {
        int[] arr = {1, -5, 3, 19, 18, 25};
        System.out.println(minDifference(arr));
    }
}
