package StringPractice;

/**
 * https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string/
 * https://www.geeksforgeeks.org/extract-maximum-numeric-value-given-string-set-2-regex-approach/  Set 2 (Regex approach)
 *https://www.youtube.com/watch?v=lviy7uP4Ues
 */
public class CalculateSumOfAllNumbersPresentInAString {

    static int findSum(String str){
        String temp = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
          // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;
                // if current character is an alphabet
            else {
                // increment sum by number found earlier (if any)
                sum = sum+ Integer.parseInt(temp);
                // reset temporary string to empty
                temp = "";
            }
        }
        // atoi(temp.c_str()) takes care of trailing numbers
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        String str = "s2au1b33h5";
        System.out.println("findSum : "+findSum("12abc20yz68"));
    }
}
