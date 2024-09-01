public class recursionpractice {
    
    public static void indexprint(int arr[], int key, int idx){
        //base case
        if( idx >= arr.length){
            return;
        }
        //logic
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }

        //call
        indexprint(arr, key, idx+1);
    }
    //problem-2 convert 1947 to one nine four seven
    public static void numbername(int number){
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        //base case
        if(number == 0){
            return; 
        }
        //logic
        int lastdigit = number%10;
        numbername(number/10);

        System.out.print(digits[lastdigit]+" ");
    }

    //probelm-4 find the number of subsrtrings that start and end with same character
    
    public static int samecharacter(String str){
        // base case
        if(str.length() == 0){ 
            return 0 ;
        }
        //logic
        return samecharacter(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str = "aba";

    System.out.println(samecharacter(str));

    }
}
