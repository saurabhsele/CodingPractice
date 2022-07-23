package Basics.recurssion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "saurabh";
        System.out.println( reverse(str));
    }

    static String reverse(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
