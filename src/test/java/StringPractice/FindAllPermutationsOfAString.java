package StringPractice;

/***
 *
 * * https://www.youtube.com/watch?v=sPAT_DbvDj0
 * https://www.youtube.com/watch?v=39SKIuA-ieY

 */
public class FindAllPermutationsOfAString {

    public static void printPermutations(String ques, String asf){

        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String leftPart = ques.substring(0,i);
            String rightPart = ques.substring(i+1);
            String roq = leftPart+rightPart;

            printPermutations(roq, asf+ch);
        }
    }

    public static String swap(String str1, int a, int b){
        char[] ch = str1.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return String.valueOf(ch);
    }

    /**
     *  * https://www.youtube.com/watch?v=S8QqfQ_7qfw  -- best
     */
    public static void permute(int index, String str){
        // base
        if(index == str.length()){
            System.out.println(str);
            return;
        }

        // logic
        for (int i = index; i < str.length() ; i++) {
            // swap
            str = swap(str, i , index);
            // recursion
            permute(index+1,str);
            //backtracking
            str = swap(str, i , index);
        }
    }

    public static void main(String[] args) {
        //printPermutations("123", "");

        permute(0, "ABC");
    }
}
