package InterviewPrograms;

import java.util.ArrayList;

public class DPWorldQuestion2 {

    // Arr = {1,2,3,1,5,4,5}
    // variance = 2
    public static void main(String[] args){
        int[] arr = {1,2,3,1,5,4,5};
        int var = 1;
        ArrayList<Integer> res = getSubArr(arr, var);
        for (Integer n:res) {
            System.out.print(n +"  ");
        }
    }

    public static ArrayList getSubArr(int[] arr, int var){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            if (getVar(arr[i], arr[i+1])>var){
                res.add(arr[i]);
            }else{
                if(res.size()>0){
                    res.add(arr[i]);
                    break;
                }
            }
        }

        return res;
    }

    public static int getVar(int x, int y){
        if (x>y)
            return x-y;
        else
            return y-x;
    }
}
