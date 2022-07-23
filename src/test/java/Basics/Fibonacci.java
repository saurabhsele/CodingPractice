package Basics;

/**
 * https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
public class Fibonacci {

    int n1 = 0;
    int n2 = 1;
    int n3 = 0;

    void printFibonacci(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    static int printFibonacciR(int count) {

       if(count <=1 )
           return count;
       return printFibonacciR(count-1) + printFibonacciR(count-2);
    }

    static void printFibonacciUsingLoop(int count) {

       int a = 0;
       int b = 1;
       int c;
        for (int i = 2; i <= count; i++) {
              c = a+b;
              a = b;
              b = c;
            System.out.print(" "+a);
        }
    }

    static int[] fib(int k){
        int[] f = new int[k];
        f[0]=0;
        f[1]=1;
        for (int i = 2; i <k ; i++) {
            f[i]=f[i-1]+f[i-2];
        }
         return f;
    }

    public static void main(String[] args) {

         System.out.print(0);
        // System.out.print(" " + 1);
        //fibonacci.printFibonacci(6);

        //printFibonacciUsingLoop(6);

//        System.out.println(fib(10));
        int[] lk = fib(10);
        for (int lm: lk) {
            System.out.println(lm);
        }
    }
}
