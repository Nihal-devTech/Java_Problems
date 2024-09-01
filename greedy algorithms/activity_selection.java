import java.net.SocketPermission;
import java.util.*;

/**
 * activity_selection
 */
public class activity_selection {

    public static void main(String[] args) {
        int start_time[] = { 1, 3, 0, 5, 8, 5 };
        int end_time[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0);

        maxAct = 1;
        int lastEnd = end_time[0];

        for (int i = 0; i < end_time.length; i++) {
            if (start_time[i] >= lastEnd) {
                maxAct++;
                lastEnd = end_time[i];
                ans.add(i);
            }
        }
        System.out.println("Maximum Activity: " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }
}