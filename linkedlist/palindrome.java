public class palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step-1 create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2 new Node's next = head
        newNode.next = head; // link

        // step-3 Head = new Node
        head = newNode;
    }

    public Node mid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        // bse case
        if (head == null && head.next == null) {
            return true;
        }

        // step-1 Find midnode
        Node midNode = mid(head);

        // step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step-3 check if 1st half= 2d half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print() {
        // base case
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {
        palindrome p = new palindrome();
        p.addFirst(1);
        p.addFirst(2);
        p.addFirst(2);
        p. addFirst(1);
        p.print();
        System.out.println(p.checkPalindrome());
    }
}
