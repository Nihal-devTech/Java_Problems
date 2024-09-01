import java.util.ArrayList;

public class swapnumber {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(4);
        List.add(5);
        List.add(8);
        List.add(9);

        System.out.println(List);

        int idx1 = 1; // 1st number is 4
        int idx2 = 2; // 2nd number is 5

        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);

        System.out.println(List);
    }
}
