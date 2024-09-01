import java.util.Arrays;

public class assignment {

  public static int difference(int arr[]) {
    Arrays.sort(arr);
    int sum = 0;
    for (int i = 1; i < arr.length; i++) {
      if ((arr[i] - arr[i - 1]) < 0) {
        int res = -(arr[i] - arr[i - 1]);
        System.out.println(res);
      }
      sum += Math.abs(arr[i] - arr[i - 1]);
    }
    return sum;
  }

  public static void main(String args[]) {
    int arr[] = { 5, 1, 5 };
    System.out.println(difference(arr));
  }
}