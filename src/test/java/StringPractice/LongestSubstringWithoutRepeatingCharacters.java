package StringPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://www.youtube.com/watch?v=jHj13UHURr8
 */
public class LongestSubstringWithoutRepeatingCharacters {

    static int longestSubstringWithoutRepeatingCharacters(String strA) {

        int n = strA.length();
        char[] arr = strA.toCharArray();
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                if (!(temp.contains(arr[j] + ""))) {
                    temp = temp + arr[j];
                    hashMap.put(temp.length(), temp);
                }
            }
        }
        System.out.print("hashMap " + hashMap);
        int intTemp = 0;

        for (Map.Entry<Integer, String> it : hashMap.entrySet()) {
            if (it.getKey() > intTemp) {
                intTemp = it.getKey();
            }
        }
        System.out.println("intTemp : " + hashMap.get(intTemp));
        return intTemp;
    }

    static int countLongestSubstringWithoutRepeatingCharacters(String strA) {

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < strA.length()) {
            char c = strA.charAt(right);
            if (seen.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            }
            else {
                while (strA.charAt(left) != c) {
                    seen.remove(strA.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String str = "abcdabcbbcdefg";
        System.out.println(" ");
        System.out.println(" tj : " + longestSubstringWithoutRepeatingCharacters(str));

        System.out.println("count : "+countLongestSubstringWithoutRepeatingCharacters(str));
    }
}
