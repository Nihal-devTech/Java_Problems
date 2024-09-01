public class palindrome {

    public static boolean palinNumber(int x) {
        int num = x;
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if (x == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int x = 121;
        System.out.println(palinNumber(x));
    }
}