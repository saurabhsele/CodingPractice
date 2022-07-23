package Basics;

import java.util.ArrayList;

public class First1 {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps " + "over the dog";
        final int MAX_CHAR = 26;
        boolean[] present = new boolean[MAX_CHAR];
        ArrayList<Character> charsList = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                present[ch - 'A'] = true;
            } else if ('a' <= ch) {
                present[ch - 'a'] = true;
            }
        }
        for (boolean indexes : present) {
            System.out.print(indexes + " ");
        }

        for (int i = 0; i < MAX_CHAR; i++)
            if (!present[i]) {
                charsList.add((char) (i + 'a'));
            }
        System.out.println(charsList);
    }
}
