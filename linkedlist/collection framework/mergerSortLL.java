import java.util.*;

public class mergerSortLL {
    // Node class definition
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // LinkedList class definition
    static class LinkedList {
        Node head;
        
        // Add node at the beginning
        void addFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        
        // Add node at the end
        void addLast(int val) {
            if (head == null) {
                head = new Node(val);
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
        }
        
        // Print the linked list
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Method to find the middle of the linked list
    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    // Method to merge two sorted linked lists
    private Node finalMerge(Node leftHead, Node rightHead) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (leftHead != null && rightHead != null) {
            if (leftHead.val <= rightHead.val) {
                temp.next = leftHead;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }

        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }

        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    // Merge sort method for linked list
    public Node Merge(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node mid = getmid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively split and merge
        Node newLeft = Merge(head);
        Node newRight = Merge(rightHead);

        // Merge the two sorted halves
        return finalMerge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(7);
        ll.addFirst(2);
        ll.addLast(5);

        ll.print();

        mergerSortLL sorter = new mergerSortLL();
        ll.head = sorter.Merge(ll.head);

        ll.print();
    }
}
