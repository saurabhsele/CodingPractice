package ArrayPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/remove-duplicates-from-unsorted-array-using-map-data-structure/
 */
public class RemoveDuplicatesFromAnUnsortedArray {

    static List<Integer> removeDuplicates(int[] arr) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int element : arr) {
            if (hashMap.get(element) == null) {
                hashMap.put(element, true);
                arrayList.add(element);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        System.out.println(removeDuplicates(arr));
    }
}
