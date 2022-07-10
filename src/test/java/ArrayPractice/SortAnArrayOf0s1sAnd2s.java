package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
public class SortAnArrayOf0s1sAnd2s {

    static int[] sortArr(int[] arr, int n){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int i;

        for ( i = 0; i < n; i++) {

            switch (arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        i = 0;
        while (count0>0){
            arr[i++] = 0;
            count0--;
        }
        while (count1>0){
            arr[i++] = 1;
            count1--;
        }
        while (count2>0){
            arr[i++] = 2;
            count2--;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sortArr(arr, n);
        for (int rf : arr) {
            System.out.print(rf+" ");
        }
    }
}
