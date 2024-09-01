public class tiling {

    public static int ways(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //logic + recursive call
        //Vertical
        int fnm1 = ways(n-1);

        //horizontal
        int fnm2 = ways(n-2);

        int TotalWays = fnm1 + fnm2;

        return TotalWays;
    }
    public static void main(String args[]){
        System.out.println(ways(7));
    }
}
