package ArrayPractice;

/**
 *
 * https://www.geeksforgeeks.org/find-the-missing-number/
 * https://www.geeksforgeeks.org/find-the-missing-number-in-a-sorted-array/ todo
 * https://www.geeksforgeeks.org/find-missing-element-in-a-sorted-array-of-consecutive-numbers/?ref=rp todo
 * https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/ todo
  */

public class FindMissingNumber {

   static int findMissingNumberInSortedArray(int[] arr){

         int size = arr.length;
         int start = 0;
         int end = size -1;
         int mid = 0;

         while ((end-start)>1){
             mid = (start+end) / 2;

             if(arr[start]-start != (arr[mid]- mid))
                 end = mid;
             else if ((arr[end]-end) != (arr[mid]-mid))
                 start = mid;

             System.out.println( "start : "+start +" end : "+end + " mid : "+mid);
         }
     return (arr[start] + 1);
    }

    static int findMissingNumberInSortedArrayByRecursion(int[] arr, int start, int end){

        if(start > end)
             return end+1;
        if(start != arr[start])
            return start;
        int mid = (start+end)/2;

        if(arr[mid] == mid)
            return findMissingNumberInSortedArrayByRecursion(arr, mid+1, end);
            return findMissingNumberInSortedArrayByRecursion(arr , start, mid);
    }

    public static void main(String[] args) {

       int[] ar = {1, 2, 3, 4, 5, 6, 9};

        System.out.println("lenght "+ar.length); // 7
        System.out.println("findMissingNumber : "+findMissingNumberInSortedArray(ar));
    }
}
