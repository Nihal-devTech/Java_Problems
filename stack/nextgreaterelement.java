import java.util.*;

public class nextgreaterelement {

    public static void problem(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(nextGreater[i]);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        problem(arr);

    }
}
