package ArrayPractice;

import java.util.HashMap;

/**
 * https://www.geeksforgeeks.org/find-frequency-number-array/
 */
public class FrequencyOfANumberInArray {

   static HashMap<Integer, Integer> hashMap = new HashMap<>();

   static void countFreq(int[] arr){

       for (int j : arr) {
           if (hashMap.containsKey(j))
               hashMap.put(j, hashMap.get(j) + 1);
           else
               hashMap.put(j, 1);
       }
    }

    static int query(int x){
        if (hashMap.containsKey(x))
            return hashMap.get(x);
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 2, 1};
        countFreq(a);
        System.out.println("out Put : "+query(2));
    }
}
