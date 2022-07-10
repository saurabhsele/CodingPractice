package StringPractice;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * https://www.geeksforgeeks.org/program-find-smallest-largest-word-string/
 *
 */
public class FindSmallestAndLargestWordInAString {

    public void smallestAndLargerWord(String str){
        String[] stringArray = str.split(" ");
        int temp=0; String strTemp="";
        TreeMap<Integer, String> tm = new TreeMap<>();
        for (String arr : stringArray) {
           if(!tm.containsValue(arr)){
             //  tm.put()
           }else {

           }
        }
    }
}
