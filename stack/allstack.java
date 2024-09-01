import java.util.*;

public class allstack {
    public static String reverseString(String s) {
        Stack<Character> nihal = new Stack<>();
        int idx = 0;

        while (idx < s.length()) {
            nihal.push(s.charAt(idx));
            idx++;
        }

        StringBuilder str = new StringBuilder("");
        while (!nihal.isEmpty()) {
            char curr = nihal.pop();
            str.append(curr);
        }
        return str.toString();
    }

    public static void main(String args[]) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
