package Basics;

public class recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int a = n * factorial(n - 1);
            System.out.println("frist" + "=" + a);
            System.out.println(n);
            return a;
        }
    }

    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        fact = factorial(n);
        System.out.println(fact);
        //gjhfgjhagfljahgljh
    }
}
