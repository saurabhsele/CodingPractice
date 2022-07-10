package ArrayPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/remove-duplicates-from-unsorted-array-using-map-data-structure/
 *
 *
 */
public class RemoveDuplicatesFromAnUnsortedArray {

    static List removeDuplicates(int[] arr) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j : arr) {
            if (hashMap.get(j) == null) {
                hashMap.put(j, true);
                arrayList.add(j);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};

        System.out.println(removeDuplicates(arr));
    }
}
