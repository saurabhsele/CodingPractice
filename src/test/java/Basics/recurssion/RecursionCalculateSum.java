package Basics.recurssion;

public class RecursionCalculateSum {
    public static void main(String[] args) {
        int[] ab ={10,12,15,2,3,4};
        System.out.println(calculateSum(ab,ab.length));
    }

    static int calculateSum(int[] a, int n){
        if(n<=0){
            return 0;
        }
        return calculateSum(a,n-1)+a[n-1];
    }
}
