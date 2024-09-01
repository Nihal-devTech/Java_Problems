public class stocks{

    public static int sell_and_buy_stocks(int prices[]){
        int BP=Integer.MAX_VALUE; //+∞
        int maxprofit=0;

        for(int i=0 ; i<prices.length ; i++){
            if(BP<prices[i]){
                int profit=prices[i]-BP;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                BP=prices[i];  //agar loss hota hai toh
            }
        }

        return maxprofit;
    }

    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};

        System.out.println(sell_and_buy_stocks(prices));
    }
}