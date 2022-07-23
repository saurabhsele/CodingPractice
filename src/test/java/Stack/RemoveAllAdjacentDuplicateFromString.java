package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateFromString {
    public static void main(String[] args) {
        String st = "abbaca";
        System.out.println(removeAdjacentDuplicate(st));
    }

    public static String removeAdjacentDuplicate(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        for (Character ch : stack) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
