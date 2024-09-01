public class printpoweer {

    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        int Xnm1 = power(x,n-1);
        int Xn = x * Xnm1;

        return Xn;
    }


    //optimised way with time complexity O(logn)
    public static long optimised(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        long halfvalue = optimised(x,n/2);
        long ans = halfvalue * halfvalue;

        //odd
        if(n%2 != 0){
            ans= x * ans;
        }

        return ans;

    }

    public static void main(String args[]){
        long x;
        long n;
        System.out.print(power(2,77));
    }
}
