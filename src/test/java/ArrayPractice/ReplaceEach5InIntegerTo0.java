package ArrayPractice;

/**
 * https://www.geeksforgeeks.org/replace-0-5-input-integer/
 */
public class ReplaceEach5InIntegerTo0 {

    static int reverseNumber(int temp) {

        int ans = 0;
        while (temp > 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        return ans;
    }

    static int convert5To0(int num) {
        if (num == 5)
            return 0;
        else {
            int temp1 = 0;
            while (num > 0) {
                int remDigit = num % 10;

                if (remDigit == 5)
                    remDigit = 0;

                temp1 = temp1 * 10 + remDigit;
                num = num / 10;
            }
            return reverseNumber(temp1);
        }
    }

    public static void main(String[] args) {
        int va1 = 10120;

    /*    List<Integer> listOfValues = fiveToZero(va1);
        for (Integer element: listOfValues) {
            sum = sum*10+element;
        }*/

        System.out.println(convert5To0(va1));
    }
}
