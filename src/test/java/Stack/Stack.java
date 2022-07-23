package Stack;

/**
 * https://www.geeksforgeeks.org/stack-class-in-java/
 */
public class Stack {
    int top = -1;
    char[] items = new char[100];

    void push(char x) {
        if (top == 99) {
            System.out.println("stack full");
        } else {
            items[++top] = x;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("underflow error");
            return '\0';
        } else {
            char element = items[top];
            top--;
            return element;
        }
    }

    boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    boolean isMatchingPair(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        else if (c1 == '{' && c2 == '}') return true;
        else return c1 == '[' && c2 == ']';
    }
}

