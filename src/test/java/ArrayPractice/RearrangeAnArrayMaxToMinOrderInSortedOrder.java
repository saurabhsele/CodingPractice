package ArrayPractice;

public class RearrangeAnArrayMaxToMinOrderInSortedOrder {
    /**
     * Desc : Rearrange the elements in mox to min from a sorted array
     */
    static int[] rearrange(int[] arr, int n) {
        int[] temp = new int[n];
        int small = 0;
        int large = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];
            flag = !flag;
        }
        return temp.clone();
    }

    public static void main(String[] args) {

    }
}
