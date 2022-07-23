package Stack;

/**
 * https://www.geeksforgeeks.org/implement-stack-using-queue/
 * https://www.geeksforgeeks.org/queue-using-stacks/
 */
public class ImplementQueueUsingTwoStack {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enQueue(char val) {
        stack1.push(val);
    }

    public void deQueue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("can't deQueue");
            }
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
