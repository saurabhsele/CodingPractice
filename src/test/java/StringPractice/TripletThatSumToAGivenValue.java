package StringPractice;

/**
 * https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 * https://www.geeksforgeeks.org/print-all-triplets-with-given-sum/
 */
public class TripletThatSumToAGivenValue {

    static boolean findNumber(int[] arr, int arr_size, int sum){

        for (int i = 0; i < arr_size-2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum){
                        System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    return true;}
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 45, 6, 10, 8 };
        findNumber(arr1, arr1.length, 22 );
    }
}
