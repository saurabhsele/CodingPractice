package StringPractice;

/**
 * https://www.geeksforgeeks.org/program-print-substrings-given-string/
 */
// Method 5
    /*
    Time complexity: O(N2), where N is the length of the input string.
    Auxiliary Space: O(N), where N is the length of the input string.
     */
public class PrintAllSubString {

    public static void printSubString(String str) {

        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                temp +=  arr[j];
                System.out.print(" " + temp);
            }
        }
    }

    public static void main(String[] args) {
        String test = "abc";
        printSubString(test);
    }
}
