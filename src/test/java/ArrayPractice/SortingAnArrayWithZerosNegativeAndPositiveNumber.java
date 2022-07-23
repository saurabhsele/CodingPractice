package ArrayPractice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://stackoverflow.com/questions/33219561/sorting-an-array-of-zeros-negative-and-positive-numbers/33219760
 * using : bubble sort : https://www.geeksforgeeks.org/bubble-sort/
 */
public class SortingAnArrayWithZerosNegativeAndPositiveNumber {

    public static void sortNumbers(int[] num) {
        int temp;
        boolean finished = false; //

        do {
            finished = true; // This will stay true if nothing needs to be changed in your array. // bucket sort
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    finished = false; // Can not go off the loop if it is not sorted yet.
                    temp = num[i]; // Interchanging of array's indexes
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        } while (!finished);
        System.out.println(Arrays.toString(num));
    }

    public static void sortNumbersViaBubble(int[] num) {
        int temp;
        boolean finished;
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {

            finished = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    finished = true;
                }
            }
            if (!finished)
                break;
            ;
        }
        System.out.println("bubble sort : " + Arrays.toString(num));
    }

    static void sortArrayViaComparator(Integer[] num) {
        Arrays.sort(num, Comparator.comparingInt(Integer::signum));
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] num = {5, -3, 0, -18, 1, 2, 0};
        sortNumbers(num);
        Integer[] num1 = {5, -3, 0, -18, 1, 2, 0};
        sortArrayViaComparator(num1);

        int[] num2 = {5, -3, 0, -18, 1, 2, 0};
        sortNumbersViaBubble(num2);
    }
}
