package Basics;

//https://www.javatpoint.com/palindrome-program-in-java
public class IsPalindromeInt {

    static boolean isPalindrome(int n) {
        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }
        while (n != 0) {
            int first = n / divisor;
            int last = n % 10;

            if (first != last)
                return false;

            n = (n % divisor) / 10;
            System.out.println("N + " + n);
            divisor = divisor / 100;
            System.out.println("divisor + " + divisor);
            System.out.println("divisor : " + divisor + " First " + first + " Last " + last);
        }
        return true;
    }

    static boolean palindrome(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int l = n % 10;
            sum = sum * 10 + l;
            n = n / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
//        isPalindrome(2332);
        System.out.println(palindrome(2331));
    }
}
