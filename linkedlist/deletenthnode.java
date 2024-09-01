public class deletenthnode {
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

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // if there is only 1 node
        if (n == sz) { // remove frst node
            head = head.next;
            return;
        }

        int index = 1;
        int indToFind = sz - n;
        Node prev = head;
        while (index < indToFind) {
            prev = prev.next;
            index++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void print() {
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

    public static boolean loopDetect() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(loopDetect());
    }
}
