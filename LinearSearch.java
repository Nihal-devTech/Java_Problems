public class LinearSearch{

    public static int Search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,15,46};
        int key=5;
        int index=Search(numbers,key);
        System.out.println("Key is at index "+index);


    }
}