public class friendspairing {

    public static int ways(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //logic + recursive call
        //single
        int single=ways(n-1);
        //pair
        int pair=ways(n-2);

        int totalways=single + (n-1)*pair;
        return totalways;
    }

    public static void main(String args[]){
        int n=3;
        System.out.println(ways(n));

    }
}
