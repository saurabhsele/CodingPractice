package StringPractice;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/count-words-appear-exactly-two-times-array-words/?ref=rp
 * https://www.youtube.com/watch?v=dX8WiwMO5PU
 */
public class CountWordsThatAppearExactlyTwoTimes {

    static int countWord(String[] strA) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String element: strA) {
            if (hashMap.containsKey(element)) {
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                hashMap.put(element, 1);
            }
        }

        System.out.println("hashMap : "+hashMap);
        int res = 0;
        for (Map.Entry<String, Integer> it : hashMap.entrySet()) {
            if (it.getValue() == 2)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {

        String[] s = { "hate", "love", "peace", "love", "peace", "hate", "love", "peace", "love", "peace" };
        System.out.println(countWord(s));
    }
}


