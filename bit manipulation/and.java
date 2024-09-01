import java.util.*;

public class and{
    
    public static void oddorEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
                System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }

    public static int getIthbit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthbit(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearIthbit(int n, int i){
        int bitmask= ~(1<<i);
        return n&bitmask;
    }
    public static void powerof2(int n){
        if((n & n-1)==0){
            System.out.println("The number is of power 2");
        }
        else{
            System.out.println("the number is something else");
        }
    }
    public static void main(String args[]){
       powerof2(16);

    }
}