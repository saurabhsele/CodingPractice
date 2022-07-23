package ArrayPractice;

/***
 * find pairs with given sum in a sorted array
 * *** Condition : Array elements are distinct and in sorted order
 */
public class PairForGivenSumInSortedArray {

    static void countPair(int[] arr, int sum) {

        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        while (low < high) {
            if (arr[low] + arr[high] > sum) {
                high--;
            } else if (arr[low] + arr[high] < sum) {
                low++;
            } else if (arr[low] + arr[high] == sum) {
                System.out.println("Pair (" + arr[low] + "," + arr[high] + ")");
                high--;
                low++;
                count++;
            }
        }
        System.out.println("count : " + count);
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        int value = 9;
        countPair(test1, value);
    }
}
