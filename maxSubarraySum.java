public class maxSubarraySum{

    public static int sum(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];//pehla element toh same hi hoga na
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                if(start==0){
                    curr_sum=prefix[end];
                }
                else{
                    curr_sum=prefix[end]-prefix[start-1];
                }

                
                if(curr_sum>max_sum){
                    max_sum=curr_sum;           
                }
                
            }
            
        }
        System.out.println(+max_sum);
        return max_sum;
    }
    public static void kadabes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];

            if(arr[i]<0){
                ms=Math.max(ms,cs);
            }

            else if(cs<0){
                cs = 0;
            }
            ms=Math.max(ms,cs);
            
        }
        System.out.println("Our max subarray sum is:"+ ms);
    }

    public static void main(String args[]){
        int arr[]={-1,-3,-1,-1};

        kadabes(arr);

    }
}