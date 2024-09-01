public class count{

    public static void countDec(int n){
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        countDec(n-1);
    }

    public static void countInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        countInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        int n=10;
        countInc(n);

}
}