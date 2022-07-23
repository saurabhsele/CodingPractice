package SearchingAlgo;

/**
 * https://www.geeksforgeeks.org/searching-algorithms/
 * Work on sorted array
 * It's repeatedly dividing the search interval in half
 */
public class BinarySearch {

    static int binarySearch(int[] arr, int start, int end, int search) {

        if (end >= start) {
            int mid = (start + end) / 2;

            if (search == arr[mid])
                return mid;

            if (search > arr[mid])
                return binarySearch(arr, mid + 1, end, search);

            return binarySearch(arr, start, mid - 1, search);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;

        System.out.println(binarySearch(arr, 0, n, x));
    }
}
