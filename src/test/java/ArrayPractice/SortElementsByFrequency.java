package ArrayPractice;

import org.testng.annotations.Test;

import java.util.*;

// https://www.geeksforgeeks.org/sort-elements-frequency-set-4-efficient-approach-using-hash/?ref=lbp
// https://www.geeksforgeeks.org/sort-elements-by-frequency/?ref=lbp
public class SortElementsByFrequency {
    @Test
    public void test1() {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        System.out.println(Arrays.toString(sortElementByFrequency(arr)));

        // List<Integer> list = Arrays.asList(arr);
        // sortElementByFrequencyUsingComparator(arr);
    }

    public static int[] sortElementByFrequency(int[] arr1) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int[] arr2 = new int[arr1.length];

        for (int elements : arr1) {
            if (tm.containsKey(elements)) {
                tm.put(elements, tm.get(elements) + 1);
            } else {
                tm.put(elements, 1);
            }
        }
        System.out.println(tm);

        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            int i = 0;
            Integer abc = entry.getValue();

            while (abc != 1) {
                arr2[i] = entry.getKey();
                abc--;
                i++;
            }
        }
        return arr2;
    }

    public static List<Integer> sortElementByFrequencyUsingComparator(List<Integer> arr) {
        HashMap<Integer, Integer> mapCount = new HashMap<>();
        HashMap<Integer, Integer> mapIndex = new HashMap<>();

        for (int j : arr) {
            if (mapCount.containsKey(j)) {
                mapCount.put(j, mapCount.get(j) + 1);
            } else {
                mapCount.put(j, 1);
                mapIndex.put(j, 1);
            }
        }

        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                int freq1 = mapCount.get(n1);
                int freq2 = mapCount.get(n2);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                } else {
                    return mapIndex.get(n1) - mapIndex.get(n2);
                }
            }
        });
        return arr;
    }
}
