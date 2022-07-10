package ArrayPractice;

public class MoveZeroToEnd {

    static int[] moveAllZeroToTheEnd(int[] arr){
        int count=0;
        int n = arr.length;
        for (int element: arr) {
            if (element != 0)
                arr[count++] = element;
        }
            while (count<n)
                arr[count++]=0;
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,9,8,4,0,0,2,7,0,6,0};

        int[] array1 = moveAllZeroToTheEnd(array);
        for (int abc: array1) {
            System.out.print(abc +" ");
        }
    }
}
