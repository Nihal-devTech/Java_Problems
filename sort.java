import java.util.Arrays;
import java.util.Collections;
public class sort{

    public static void Bubble_sort(int arr[]){
        //turns length-1 tak hee chlna chahiye
        for(int i=0 ; i<=arr.length-1; i++){
            //har number ko traverse krne k liye
            for(int j=0 ; j<arr.length-1-i ; j++){ //har round k saath numbers api jage p fit hote jaenge
                if(arr[j]<arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Selection_Sort(int arr[]){
        for(int i=0 ; i<arr.length-2 ; i++){ //count turns
            int min_element=i;               //min pos= current pos

            //finding min element from the remaining unsorted array
            for(int j=i+1 ; j<=arr.length-1 ; j++){
                if(arr[min_element]>arr[j]){       
                    min_element=j;       //finaly min nikal liya          
                }                              
            }
            //swap
            //min ko current k saath swap krdia
            int temp=arr[i];
            arr[i]=arr[min_element];
            arr[min_element]=temp;
        }
    }

    public static void Internal(Integer arr[]){
        Arrays.sort(arr, Collections.reverseOrder());
        
    }


    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};//Object type integer
        Bubble_sort(arr);
        Print(arr);

    }
}
