package StringPractice;

public class PrintOccurrenceOfEachCharacterJustAfterConsecutiveOcc {

    static void printRLE(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print("" + count + ""+s.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String strTest = "aaaabcccdaaaaaaaaa";

        printRLE(strTest);
    }
}
