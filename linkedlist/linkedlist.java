public class linkedlist {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        // special case
        if (size == 0) {
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        // base case ending---^
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        // special case
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = tail.data;
            head = tail = null;
            size = 0;
            return value;
        }
        // base case ending---^
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;

    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        // recursive call
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public int itrSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        // key not found
        return -1;

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

    public void reverse() {
        Node prev = null; // initially previous will be null
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(0, 5);
        ll.print();
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(9));

    }
}
