package Basics;

import java.util.HashMap;

class Solution {
    public static boolean digitCount(String num) {

        HashMap<Character, Integer> hm = new HashMap<>();

        char[] ch = num.toCharArray();
        int j = 0;
        for(int i = 0; i < num.length(); i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i], hm.get(ch[i])+1);
            }else{
                hm.put(ch[i], 1);
            }
        }
        System.out.println(hm);
        while(num.length() > j){
            if(j == hm.get(ch[j]))
                return true;
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( digitCount("120"));
    }
}
