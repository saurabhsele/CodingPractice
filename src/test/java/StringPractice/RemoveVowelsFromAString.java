package StringPractice;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/program-remove-vowels-string/
 * https://www.geeksforgeeks.org/remove-consecutive-vowels-string/?ref=rp  todo consecutive vowels
 */
public class RemoveVowelsFromAString {

    static String removeVowels(String str){
        Character[] vowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        List<Character> listOfVowels = Arrays.asList(vowels);

        StringBuilder stringBuffer = new StringBuilder(str);

        System.out.println("stringBuffer : "+stringBuffer);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if(listOfVowels.contains(stringBuffer.charAt(i))){
                stringBuffer.replace(i, i+1, "");
                i--;
            }
        }
     return stringBuffer.toString();
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        System.out.println(removeVowels(str));
    }
}
