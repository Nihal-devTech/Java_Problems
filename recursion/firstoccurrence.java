public class firstoccurrence {
    
    public static int FirstCall(int arr[], int key, int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstCall(arr , key, i+1);
    }

    public static int LastCall(int arr[], int key, int i){
        //base case
        if(i==arr.length){
            return -1;
        }
        
        int isFound=LastCall(arr,key,i+1);

        if(isFound==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }
    
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
 
        System.out.print(LastCall(arr, 5, 0));
    }
}
