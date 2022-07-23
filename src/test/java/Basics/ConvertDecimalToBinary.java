package Basics;

public class ConvertDecimalToBinary {

    static int[] decimalToBinary(int num){
        int[] arr = new int[20];
        int count = 0;
        while (num > 0){
            arr[count++] = num%2;
            num = num/2;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] ab = decimalToBinary(560);
        for (int b : ab) {
            System.out.print(b);
        }

    }
}
