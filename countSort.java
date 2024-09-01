public class countSort{

    public static void count(int arr[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            Largest=Math.max(Largest, arr[i]);
        }

        int count[]= new int[Largest+1];
        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void Print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={23,5,4,1,6};
        count(arr);
        Print(arr);

    }
}