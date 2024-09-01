import java.util.*;

public class binary {
    public static void BINARY(int n) {
        Deque<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 1; i <= n; i++) {
            String current = q.removeFirst();

            q.add(current + "0");
            
            q.add(current + "1");

            System.out.print(current + " ");
        }
    }

    public static void main(String args[]) {
        int n = 5;
        BINARY(n);
    }
}
