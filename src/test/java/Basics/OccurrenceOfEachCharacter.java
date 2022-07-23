package Basics;

/**
 * https://www.geeksforgeeks.org/java-program-count-occurrences-character/?ref=rp
 */

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int MAX_CHAR = 256;

        int[] count = new int[MAX_CHAR];
        for (int a : count) {
            System.out.print(" " + a);
        }

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        System.out.println();
        for (int b : count) {
            System.out.print(" " + b);
        }
        char[] charNew = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charNew[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == charNew[j])
                    find++;
            }
            if (find == 1)
                System.out.println(
                        "Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }
}

