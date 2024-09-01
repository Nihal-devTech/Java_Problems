import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * indianCoins
 */
public class indianCoins {

    public static void main(String[] args) {
        Integer notes[] = { 1, 2, 5, 10, 20, 100, 200, 500 };

        int amount = 540;

        Arrays.sort(notes, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] <= amount) {
                while (notes[i] <= amount) {
                    count++;
                    ans.add(notes[i]);
                    amount = amount - notes[i];
                }
            }
        }
        System.out.println(count);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}