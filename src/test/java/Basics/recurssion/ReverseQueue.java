package Basics.recurssion;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(24);
        queue.add(9);
        queue.add(6);
        queue.add(8);
        queue.add(4);
        queue.add(1);
        queue.add(8);
        queue.add(3);
        queue.add(6);

        reverseQueue(queue);

        System.out.println(queue);
    }

    static Queue<Integer> reverseQueue(Queue<Integer> queue1){
       if (queue1.isEmpty())
           return queue1;

       int tempData = queue1.peek();
       queue1.remove();
       queue1 = reverseQueue(queue1);
       queue1.add(tempData);
       return queue1;
    }
}
