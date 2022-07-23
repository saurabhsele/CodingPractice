package Basics;

/**
 * https://www.geeksforgeeks.org/program-check-input-integer-string/
 */
public class InputIsStringOrInteger {

    static boolean isNumber(String str) {
        for (char element : str.toCharArray())
            if (Character.isDigit(element))
                return false;

        return true;
    }

    public static void main(String[] args) {
        String str = "123a4";
        System.out.println(isNumber(str));
    }
}
