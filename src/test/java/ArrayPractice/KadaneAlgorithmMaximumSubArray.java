package ArrayPractice;

/**
 * https://www.youtube.com/watch?v=0yQ1lVbXLIM
 * https://prakashshukla.com/videos.html
 */
public class KadaneAlgorithmMaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int current_sum = 0;

        for (int elements : nums) {
            current_sum = Math.max(elements, current_sum + elements);
            bestSum = Math.max(bestSum, current_sum);
        }
        return bestSum;
    }

    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("maxSubArray : " + maxSubArray(num));
    }
}
