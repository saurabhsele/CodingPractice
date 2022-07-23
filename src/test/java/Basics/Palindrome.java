package Basics;

/**
 * https://www.geeksforgeeks.org/java-program-to-reverse-a-number-check-if-it-is-a-palindrome/?ref=rp
 */
public class Palindrome {

    static boolean isPalindrome(String str) {
        String newStr = reverse(str);

        System.out.println("str : " + str);
        System.out.println("newStr : " + newStr);
        if (str.equals(newStr)) {
            return true;
        } else {
            return false;
        }
    }

    static String reverse(String str) {

        char[] strArray = str.toCharArray();
        String temp = "";
        int n = strArray.length;
        for (int i = n - 1; i >= 0; i--) {
            temp = temp + strArray[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        String testStr = "NITIN";
        System.out.println("isPalindrome : " + isPalindrome(testStr));
    }
}
