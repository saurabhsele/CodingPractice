package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
public class ReverseAnArray {

    static int[] reverseAnArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static void reverseAnArrayUsingRecursion(int[] arr, int start, int end) {

        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseAnArrayUsingRecursion(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//         reverseAnArray(arr);

        reverseAnArrayUsingRecursion(arr, 0, arr.length - 1);
        for (int abcd : arr) {
            System.out.print(" " + abcd);
        }
    }
}
