package StringPractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/?ref=lbp
 * https://www.youtube.com/watch?v=jHj13UHURr8
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void longestString(String str){
        String longestSubString = null;
        int longestSubStringLength =0;
        char[] charArray = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(!map.containsKey(ch)){
                map.put(ch,i); // storing char as key and index as value in the map.
            }else { //
                i = map.get(ch);
                map.clear();
            }
            /**
             * each time, checking the size of map with previous value
              */
              if(map.size() > longestSubStringLength){
                longestSubString = map.keySet().toString();
                longestSubStringLength = map.size();
            }
        }
        System.out.println(longestSubString);
        System.out.println(longestSubStringLength);
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
        String str = "aa";
        longestString(str);
        countLongestSubstringWithoutRepeatingCharacters(str);
    }
}
