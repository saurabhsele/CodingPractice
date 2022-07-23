package StringPractice;

public class PrintAllSubString {
    public static void printAllSubString(String str){

        for (int i = 0; i < str.length(); i++) {
            String temp="";
            for (int j = i; j < str.length() ; j++) {
                temp +=str.charAt(j);
                System.out.println(temp+"\n");
            }
        }
    }

    public static void main(String[] args) {
        String testStr = "abc";
        printAllSubString(testStr);
    }
}
