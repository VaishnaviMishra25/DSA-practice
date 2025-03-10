// Java program to detect loop in a linked list
// using hashset

import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class GfG {
    static boolean detectLoop(Node head) {
        HashSet<Node> st = new HashSet<>();

        while (head != null) {

            // If this node is already present
            // in hashmap it means there is a cycle
            if (st.contains(head))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            st.add(head);

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3-> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        // Create a loop
        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
