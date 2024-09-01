import java.util.ArrayList;

public class watertrapping_2pointer {

    public static int storingwater(ArrayList<Integer> height) {

        int maxwater = 0;
        int Lp = 0;
        int Rp = height.size() - 1;

        while (Lp < Rp) {

            int ht = Math.min(height.get(Lp), height.get(Rp));
            int width = Rp - Lp;

            int currwater = ht * width;

            maxwater = Math.max(maxwater, currwater);

            // updating pointer

            if (Lp < Rp) {
                Lp++;
            } else {
                Rp--;
            }
        }

        return maxwater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storingwater(height));
    }
}
