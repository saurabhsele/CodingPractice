package StringPractice;

import org.testng.annotations.Test;

/**
 * https://www.youtube.com/watch?v=Up2AnlAC7EI
 *  // todo need to check with roopesh bhai
 */
public class CheckIfAStringIsASubstringOfAnother {
    @Test
    public void test(){
        System.out.println(subStringOfOther("abcd","cd"));
    }
    public static int subStringOfOther(String str, String subString){

        for (int i = 0; i < str.length(); i++) {
            String temp="";
            for (int j = i; j < str.length(); j++) {
                temp +=str.charAt(j);
                if (temp.equals(subString))
                break;
            }
            return i;
        }
        return -1;
    }
}
