package StringPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
        String str = "abbaca";
        longestString1(str);
    }

    public static void longestString1(String str1){
        String longestSubString = null;
        int longestSubStringLength =0;
        char[] charArray = str1.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(!map.containsKey(charArray[i])){
                map.put(ch,i);
            }else {
                i = map.get(ch);
                map.clear();
            }
            if(map.size() > longestSubStringLength){
                longestSubString = map.keySet().toString();
                longestSubStringLength = map.size();
            }
        }
        System.out.println(longestSubString);
        System.out.println(longestSubStringLength);
    }
}
