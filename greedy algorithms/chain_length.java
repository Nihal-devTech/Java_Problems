import java.util.Arrays;
import java.util.Comparator;

import javax.sound.midi.SysexMessage;

public class chain_length {

    public static void main(String[] args) {
        int pairs[][] = { { 5, 28 }, { 39, 60 }, { 5, 24 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int ans = 1;
        int lastend = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastend) {
                ans++;
                lastend = pairs[i][1];
                System.out.println(lastend);
            }
        }
        System.out.println(ans);
    }
}