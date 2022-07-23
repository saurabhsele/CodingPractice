package StringPractice;

/**
 * https://www.geeksforgeeks.org/check-if-a-string-can-be-split-into-two-substrings-such-that-one-substring-is-a-substring-of-the-other/?ref=rp
 */
class OneSubstringIsSubstringOfOthers {

    /**
     * Function to check if a String can be  divided into two subStrings such that
     * one subString is subString of the other
     */
    static void splitString(String str, int n) {
        // Store the last character of str
        char character = str.charAt(n - 1);
        System.out.println("C : " + character);
        int f = 0;
        // Traverse the characters at indices [0, N-2]
        for (int i = 0; i < n - 1; i++) {
            // Check if the current character is equal to the last character
            if (str.charAt(i) == character) {
                // If true, set f = 1
                f = 1;
                // Break out of the loop
                break;
            }
        }

        if (f > 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    // Driver Code
    public static void main(String[] args) {
        // Given String, S
        String S = "abcdab";
        // Store the size of S
        int N = S.length();
        // Function Call
        splitString(S, N);
    }
}


