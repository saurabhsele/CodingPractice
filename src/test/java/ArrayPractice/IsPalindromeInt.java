package ArrayPractice;

public class IsPalindromeInt {

    static boolean isPalindrome(int n){
        int divisor = 1;
        while (n/divisor >=10){
            divisor *=10;
        }
        while (n!=0) {
            int first = n / divisor;
            int last = n % 10;

            if (first != last)
                return false;

            n = (n % divisor) / 10;
            System.out.println("N + "+n);
            divisor = divisor / 100;
            System.out.println("divisor + "+divisor);
            System.out.println("divisor : "+divisor +" First "+ first+" Last "+last);
        }
        return true;
        }


    public static void main(String[] args) {
        isPalindrome(2332);
    }
}
