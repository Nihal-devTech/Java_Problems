public class fibonacci {

    public static int fib(int n){
        //base case
        if(n==1||n==0){
            return n;
        }
        int F1=fib(n-1);
        int F2=fib(n-2);

        int ans=F1+F2;

        return ans;
    }

    public static void main(String[] args) {
        int n=5;  
        System.out.print(fib(4));  
    }
}
