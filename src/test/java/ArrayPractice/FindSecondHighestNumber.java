package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/find-second-largest-element-array/
 */
public class FindSecondHighestNumber {

    static void secondHighest(int[] arr, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (n < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] > second)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest element");
        else
            System.out.print("The second largest element is " + second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        secondHighest(arr, n);
    }
}
