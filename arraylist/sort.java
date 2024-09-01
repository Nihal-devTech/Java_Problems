import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // comparator function
        // descemding order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
