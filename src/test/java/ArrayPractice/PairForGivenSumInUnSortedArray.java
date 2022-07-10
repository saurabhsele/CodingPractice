package ArrayPractice;
/**
 * https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */

import java.util.HashSet;

public class    PairForGivenSumInUnSortedArray {

    static int countPair(int[] arr, int sum){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]+arr[j]) == sum){
                    System.out.println("Pair ("+arr[i]+", "+arr[j]+")");
                    count++;
                }
            }
        }
        return count;
    }

    static int countPairHashSet(int[] arr, int sum){
        int count = 0;
        int n = arr.length;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int j : arr) {
            int temp = sum - j;
            if (hashSet.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + j + ", " + temp + ")");
                count++;
            }
            hashSet.add(j);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,5,7,-1,5};
        int sum = 6;

        System.out.println(countPair(array,sum));
        System.out.println(countPairHashSet(array,sum));
    }
}
