package LinkedListPractice;

/**
 * https://www.geeksforgeeks.org/linked-list-set-1-introduction/?ref=lbp
 * https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/?ref=lbp
 * https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/?ref=lbp
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node firstNode = new Node(1);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(9);
        list.head = firstNode;
        list.head.next = secondNode;
        secondNode.next = thirdNode;

        list.printList();

        System.out.println(list.detectNode(secondNode));


        LinkedList list2 = new LinkedList();
        list2.push(8);
        list2.push(10);
        list2.push(14);

        list2.printList();
    }
}
