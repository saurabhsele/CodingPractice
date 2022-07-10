package old;

public class BooleanArray {
    public static void main(String[] args) {

        final int MAX_CHARS = 26;

        String str = "The quick brown fox jumps " + "over the dog";

        System.out.println("str.charAt(2) : "+str.charAt(2));
        int abc = str.charAt(1) - 'a';

        System.out.println("g : "+(char) (6 + 'a')); // it will return g
        System.out.println("abc : " + abc);
        System.out.println("g-a : "+('g' - 'a'));

        boolean[] present = new boolean[MAX_CHARS];
        for (boolean abcd : present) {
            System.out.print(abcd + " ");
        }
    }
}
