package old;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighestFreqFirst {
    public static void main(String[] args) {

        String str = "aaaabddcd";

        TreeMap<Integer, Character> tMap = new TreeMap<>();
        char[] arr = str.toCharArray();
        int i=0;
        for (char element : arr) {

            if (tMap.containsValue(element))
                tMap.put(i+1,element);

            tMap.put(1,element);
        }
        System.out.println("tMap : "+tMap);

        PriorityQueue<Character> pQueue = new PriorityQueue<>();
        for (char element : str.toCharArray()) {
            pQueue.add(element);
        }
        System.out.println("pQueue : "+pQueue);
    }
}
