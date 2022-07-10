package InterviewPrograms;

public class DPWorldQuestion1 {
    //integer array
//   input =  {7,2,1,5,8,6,3}
//   output =  {1,2,3,5,8,6,7}
    public static void main(String[] args){
        int[] arr = {7,2,1,5,8,6,3};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(isEven(arr[i]))
                    break;
                else{
                    if (!isEven(arr[j])){
                        if ((arr[i]>arr[j])){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        for (int n:arr
             ) {
            System.out.print(n +" ");
        }
    }
     public static boolean isEven(int num){
        if(num%2 == 0)
            return true;
        else
            return false;
     }
}

/*
* First we got odd numbers sub array
* Then apply Array.sort() into odd numbers array
* then traversing the main array and replace the integers
*
* */
