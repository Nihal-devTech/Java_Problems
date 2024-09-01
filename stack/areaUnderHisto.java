import java.util.*;

public class areaUnderHisto {

    public static void Area(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];
        
        // next smaller right
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Clear the stack before computing next smaller left
        s.clear();
        
        // next smaller left
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // Calculate the maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        
        System.out.println("Maximum area covered is: " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4 };
        Area(arr);
    }
}
