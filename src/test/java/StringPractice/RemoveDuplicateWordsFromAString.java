package StringPractice;

/**
 * https://www.geeksforgeeks.org/remove-duplicaterepeated-words-string/
 */
public class RemoveDuplicateWordsFromAString {

    public static void removeDuplicateWords(String str){
        String[] strSplit = str.split(" ");
        String temp ="";

        for (String strC: strSplit) {
            if(!temp.contains(strC)){
                temp += " "+strC;
                temp = temp.trim();
            }
        }
        System.out.println("temp : "+temp);
    }
    public static void main(String[] args) {
        String str = "Geeks for Geeks A Computer Science portal for Geeks";
        removeDuplicateWords(str);
    }
}
