package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/ todo
 * https://www.geeksforgeeks.org/segregating-negative-and-positive-maintaining-order-and-o1-space/ todo
 *
 */
public class SegregateNegativeAndPositiveMaintainingOrder {

    static int[] segregateNegativeAndPositiveMaintainingOrder(int[] arr, int n) {
        int i = 0;
        int j = n - 1;

        while (true) {
            while (arr[i] < 0 && i < j) {
                i++;
            }
            while (arr[j] > 0 && i < j) {
                j--;
            }
            if (i < j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            } else {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12,11,-13,-5,6,-7,5,-3,-6};
                //{3,8,-4,5,-6,5};
        int le = arr.length;

    /*    int[] ar = segregateNegativeAndPositiveMaintainingOrder(arr, le);
        for (int ak : ar) {
            System.out.print(ak+" ");
        }*/

        int[] arr2 = segregateNegativeAndPositiveMaintainingOrder1(arr, le);
        for (int ak : arr2) {
            System.out.print(ak+" ");
        }
    }

    static int[] segregateNegativeAndPositiveMaintainingOrder1(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        int temp =0;

        while (start<end){
            if(arr[start] <0){
                start++;
            }else if(arr[end]>0){
                end--;
            }else {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        return arr;
    }
}

