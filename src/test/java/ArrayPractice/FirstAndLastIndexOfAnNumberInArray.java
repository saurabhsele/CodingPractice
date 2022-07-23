package ArrayPractice;

/**
 * https://www.youtube.com/watch?v=lviy7uP4Ues
 * <p>
 * https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
 */
public class FirstAndLastIndexOfAnNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 8;
        firstAndLastIndexOfANumber(arr, x);
    }

    static void firstAndLastIndexOfANumber(int[] arr, int b) {

        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == b && firstIndex == -1) {
                firstIndex = i;
            }
            if (arr[i] == b && firstIndex != -1) {
                secondIndex = i;
            }
        }
        System.out.println("firstIndex : " + firstIndex);
        System.out.println("secondIndex : " + secondIndex);
    }
}
