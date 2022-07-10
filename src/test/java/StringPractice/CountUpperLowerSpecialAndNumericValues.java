package StringPractice;

/**
 * https://www.geeksforgeeks.org/count-uppercase-lowercase-special-character-numeric-values/
 */
public class CountUpperLowerSpecialAndNumericValues {

    static void countUpperLowerSpecialAndNumeric(String str) {
        char[] strArray = str.toCharArray();
        int upperCount = 0;
        int lowerCount = 0;
        int numericCount = 0;
        int specialCount = 0;

        for (char element : strArray) {
            if (element >= 'A' && element <= 'Z')
                upperCount++;
            else if (element >= 'a' && element <= 'z')
                lowerCount++;
            else if (element >= '0' && element <= '9')
                numericCount++;
            else
                specialCount++;
        }

        System.out.println("Lower case letters : " + lowerCount);
        System.out.println("Upper case letters : " + upperCount);
        System.out.println("Number : " + numericCount);
        System.out.println("Special characters : " + specialCount);
    }

    public static void main(String[] args) {
        String str = "#GeeKs01fOr@gEEks07";
        countUpperLowerSpecialAndNumeric(str);
    }
}

