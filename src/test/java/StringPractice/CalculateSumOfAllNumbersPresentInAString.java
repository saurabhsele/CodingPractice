package StringPractice;

/**
 * https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string/
 * https://www.geeksforgeeks.org/extract-maximum-numeric-value-given-string-set-2-regex-approach/  Set 2 (Regex approach)
 */
public class CalculateSumOfAllNumbersPresentInAString {

    static int sumOfNumbers(String str){
        int sum = 0;
        char[] strArray = str.toCharArray();
        for (char ch: strArray) {
            if (Character.isDigit(ch)){
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "s2au1b3h5";
        System.out.println(sumOfNumbers(str));
    }
}
