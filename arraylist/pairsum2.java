import java.util.ArrayList;

public class pairsum2 {

    public static boolean sum(ArrayList<Integer> list, int target) {
        int Lp = 0;
        int Rp = list.size() - 1;

        while (Lp != Rp) {
            if (list.get(Lp) + list.get(Rp) == 5) {
                return true;
            } else if (list.get(Lp) + list.get(Rp) > target) {
                Rp--;
            } else {
                Lp++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(sum(list, target));
    }
}
