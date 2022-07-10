package ArrayPractice;
// Java program to find large
// factorials using BigInteger

import java.math.BigInteger;

/**
 * https://www.geeksforgeeks.org/factorial-large-number/
 */
public class FactorialOfBigNumber {

    static BigInteger factorial(int n) {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    public static void main(String args[]) throws Exception {
        int n = 20;
        System.out.println(factorial(n));
    }
}
