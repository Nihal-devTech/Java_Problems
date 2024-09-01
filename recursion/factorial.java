public class factorial {
    
    public static int fact(int n){

        //base case
        if(n==0){
            return 1;
        }
        int f2=fact(n-1);
        System.out.println(f2+" "); 
        int f1=n*f2;
        return f1;
    }
    
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
}
