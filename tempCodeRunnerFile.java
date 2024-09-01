public class BinarySearch{
    
    public static int Search(int array,int key){
        int start=0;
        int end=array.length-1;

        while(array[start]<=array[end]){
            int mid=(start+end)/2;

            if(array[mid]==key){
                return mid;
            }
            if(array[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int array[]={1,2,3,4,5,6,7,8,9};
        int key=7;

        System.out,println("index for key is: "+Search(array,key));

    }
}