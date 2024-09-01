public class factorial{
    public static int factorials(int n){
        int f=1;
        
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int fact_n=factorials(n);
        int fact_r=factorials(r);
        int fact_nmr=factorials(n-r);

        int binCoeff=fact_n/(fact_r*fact_nmr);

        return binCoeff;
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
    public static void primes(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){
        primes(28);
    }
}