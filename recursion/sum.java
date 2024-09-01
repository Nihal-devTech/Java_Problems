public class sum {

    public static int Sum(int n){
        //Base case
        if(n==1){
            return 1;
        }
        int S1=Sum(n-1);
        int S2=n+S1;

        return S2;


    }
    public static void main(String args[]){
        int n=5;
        System.out.print(Sum(n));
    }
}
