package StringPractice;

import java.util.StringTokenizer;

/**
 * https://www.geeksforgeeks.org/count-words-in-a-given-string/
 */
public class CountWordsInAGivenString {


    static int countWords(String str){

        if(str == null || str.isEmpty())
            return 0;

        str = str.trim();
        String[] strArray = str.split(" ");

        return strArray.length;
    }

    static int countWordsUsingTokenizer(String str)
    {
        // Check if the string is null or empty then return zero
        if (str    == null || str.isEmpty())
            return 0;

        // Create a StringTokenizer with the given string passed as a parameter
        StringTokenizer tokens = new StringTokenizer(str);

        // Return the number of words in the given string using countTokens() method
        return tokens.countTokens();
    }

    public static void main(String[] args)
    {
        String str = "One two three four five";
        System.out.println("No of words : " + countWords(str));
    }
}
