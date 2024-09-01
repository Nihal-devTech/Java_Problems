import java.util.ArrayList;

public class stack {

    static class StackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return (list.size() == 0);
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        StackB s = new StackB();
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}