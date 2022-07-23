package LinkedListPractice;

import java.util.HashSet;

public class LinkedList {

    Node head;

    /**
     * https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/?ref=lbp
     */

    public void push(int vale) {
        Node node = new Node(vale);
        node.next = head;
        head = node;
    }

    public boolean detectNode(Node node1) {
        HashSet<Node> set = new HashSet<>();
        while (node1 != null) {
            if (set.contains(node1))
                return true;
            set.add(node1);
            node1 = node1.next;
        }
        return false;
    }

    /**
     * https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/?ref=lbp
     */
    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = head.next; // Changed head
            return;
        }

        // search for the key to be deleted, keep track of previous node as we need to change temp.next()
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if (temp == null)
            return;
        // Unlink the node from linked list
        prev.next = temp.next;
    }

    boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }
        Node node = head.next;

        while (node != null && node != head)
            node = node.next;

        return (node == head);
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}
