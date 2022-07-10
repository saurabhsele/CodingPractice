package StringPractice;

/**
 * https://www.geeksforgeeks.org/java-program-swap-first-last-characters-words-sentence/
 */
public class SwapFirstAndLastCharactersOfWordsInASentence {

   static String swapFirstAndLastCharOfAWord(String str){

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int k = i;
            while ( i < ch.length && ch[i] !=' ')
               i++;

            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;
        }
        return new String(ch);
    }
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        System.out.println("swapFirstAndLastCharOfAWord : "+swapFirstAndLastCharOfAWord(str));
    }
}
