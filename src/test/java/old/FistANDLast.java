package old;

public class FistANDLast {
    public String str(String abc) {
        String result = "";
        char[] arr = abc.toCharArray();

        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        char abcd = arr[arr.length - 1];

        return abc;
    }
}
