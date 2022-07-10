package StringPractice;

/**
 * https://www.java67.com/2017/07/string-rotation-in-java-write-program.html
 */
public class StringRotation {

    static boolean rotation(String original, String rotation) {

        if (original.length() != rotation.length())
            return false;

        String concatenated = original + original;

        System.out.println("concatenated : "+concatenated);
        System.out.println("concatenated.indexOf(rotation) : "+ concatenated.indexOf(rotation));

        return concatenated.contains(rotation);
    }

    public static void main(String[] args) {
        String s1 = "IndiaUSAEngland";
        String s2 = "USAEnglandIndia";
        System.out.println(rotation(s1, s2));
    }
}
