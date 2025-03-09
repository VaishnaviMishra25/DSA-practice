// Java program to delete nth node from last
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Class containing the function to remove Nth node from end
public class GfG {
  
    // Function to remove the Nth node from the end
    static Node removeNthFromEnd(Node head, int N) {
      
        // Calculate the length of the linked list
        int length = 0;
        Node curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Calculate the position to remove from front
        int target = length - N + 1;

        // If target is 1, remove the head node
        if (target == 1) {
            return head.next;
        }

        // Traverse to the node just before the target
        curr = head;
        for (int i = 1; i < target - 1; i++) {
            curr = curr.next;
        }

        // Remove the target node
        curr.next = curr.next.next;

        return head;
    }

    // This function prints the contents of the linked list
    static void printList(Node node) {
        Node curr = node;  
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int N = 2; 
        head = removeNthFromEnd(head, N);

        printList(head);  
    }
}
