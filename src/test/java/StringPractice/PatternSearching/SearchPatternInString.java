package StringPractice.PatternSearching;

/* Java program for A modified Naive Pattern Searching algorithm that is optimized for the cases
when all characters of pattern are different */

/**
 * https://www.geeksforgeeks.org/optimized-naive-algorithm-for-pattern-searching/
 *
 * https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/  -- sliding window
 */

class SearchPatternInString {

    /* A modified Naive Pattern Searching algorithm that is optimized for the
cases when all characters of pattern are different */
    static void search( String txt, String pat)
    {
        int patternLength = pat.length();
        int txtLength = txt.length();
        int i = 0;

        while (i <= txtLength - patternLength) {
            int j;

            /* For current index i, check for pattern match */
            for (j = 0; j < patternLength; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == patternLength) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            {
                System.out.println("Pattern found at index " + i);
                i = i + patternLength;
            }
            else if (j == 0)
                i = i + 1;
            else
                i = i + j; // slide the pattern by j
        }
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        String txt = "ABCDABCABCDAAAABCD";
        String pat = "ABCD";
        search(pat, txt);
    }
}

