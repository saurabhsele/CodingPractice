package ArrayPractice;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/java-program-to-find-common-elements-between-two-arrays/   using hashing

public class PrintUnCommonElementFromSortedArray {

     static ArrayList<Integer> printUnCommonElement(int[] arr1, int[] arr2){

          ArrayList<Integer> arrCommon = new ArrayList<>();
         int n1 = arr1.length;
         int n2 = arr2.length;
         int i = 0;
         int j = 0;
         int k = 0;
         while (i<n1 && j<n2){
              if(arr1[i] < arr2[j]) {
                   arrCommon.add(arr1[i]);
                   i++;
                   k++;
              }
              else  if(arr1[i] > arr2[j]) {
                   arrCommon.add(arr1[j]);
                   j++;
                   k++;
              }
              else {
                   i++;
                   j++;
              }
              while (i<n2){
                   arrCommon.add(arr1[i]);
                   i++;
                   k++;
              }
         }
         return arrCommon;
     }

     public static void main(String[] args) {
          int[] arr1 = {10,20,30};
          int[] arr2 = {20,25,30,40,50};

          printUnCommonElement(arr1, arr2);
     }
}
