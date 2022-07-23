package StringPractice;
/**
 *    https://www.geeksforgeeks.org/reverse-a-string-in-java/
  */

public class ReverseString {

    public static void main(String[] args) {
        String strTest = "saurabh";
        System.out.println(reverseString(strTest));
        String strTestNew = "geeks for geek";
        System.out.println("StringBuilder : "+reverseViaIndexing(strTestNew));
    }
    public static String reverseStringPlusMethod(String str){
        String tempStr= "";
        char[] charArray =str.toCharArray();
        for (char c : charArray) {
            tempStr = c+tempStr;
        }
        return tempStr;
    }

    public static String reverseString(String str){
        String tempStr= "";
        char[] charArray =str.toCharArray();
        for (int i = charArray.length-1; i >=0 ; i--) {
            tempStr =tempStr.concat(String.valueOf(charArray[i]));
        }
        return tempStr;
    }

    public static String reverseStringBuilder(String str){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        strBuilder.reverse();
        return  strBuilder.toString();
    }

    public static String reverseViaIndexing(String str){
        int leftIndex ;
        int rightIndex = str.length()-1;
        String tempStr="";
        char[] charArrayTemp = str.toCharArray();

        for ( leftIndex = 0 ; leftIndex < rightIndex ; leftIndex++,rightIndex--) {
            char temp = charArrayTemp[leftIndex];
            charArrayTemp[leftIndex] = charArrayTemp[rightIndex];
            charArrayTemp[rightIndex] = temp;
        }

        for (char c: charArrayTemp) {
            tempStr= tempStr.concat(String.valueOf(c));
        }
        return tempStr;
    }
}
