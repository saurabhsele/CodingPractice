package StringPractice;

import java.util.TreeMap;

/**
 * https://www.geeksforgeeks.org/program-find-smallest-largest-word-string/
 *
 */
public class FindSmallestAndLargestWordInAString {

    public static void smallestAndLargerWord(String str){
        String[] stringArray = str.split(" ");
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (String arr : stringArray) {
              tm.put(arr, arr.length());
        }
        String lmk = tm.firstKey();
        String abc = tm.lastKey();

        System.out.println("lmk : "+lmk);
        System.out.println("abc : "+abc);
    }

    public static void main(String[] args) {
        String abc = "GeeksforGeeks A Computer Science portal for Geeks";
        smallestAndLargerWord(abc);
    }
}
