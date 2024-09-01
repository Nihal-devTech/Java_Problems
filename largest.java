public class largest{
    
    public static int smallSearch(int array[]){
        int smallest=Integer.MAX_VALUE;

        for(int i=0 ;i<array.length; i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        return smallest;
    }
    
    public static int Search(int array[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
           
        }
        return largest;
    }
    
    public static void main(String args[]){
        int array[]={9,5,6,18,3,20};
        int value=Search(array);
        int n=smallSearch(array);
        System.out.println("The largest numbver is "+value);
        System.out.println("The smallest numbver is "+n);
        
    }
}