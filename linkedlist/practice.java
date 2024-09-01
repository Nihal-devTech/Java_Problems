public class practice {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addF(int data) {
        // step-1 create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2 new Node's next = head
        newNode.next = head; // link

        // step-3 Head = new Node
        head = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice practice = new practice();
        practice.addF(2);
        practice.addF(4);
        practice.addF(6);
    }
}
