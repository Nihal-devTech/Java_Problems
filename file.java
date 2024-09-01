import java.util.*;
public class file{
    public static void main(String args[]){
        System.out.print("Please Provide your income: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        

        if(n<=500000){
            System.out.println("No tax invoked");
        }
        else if(n>500000 && n<1000000){
            System.out.println("20% tax to be invoked");
            System.out.println(n*(20/100)+" Will be invoked");
        }
        else{
            System.out.println("30% tax to be invoked");
            System.out.println(n*(30/100)+" Will be invoked");
        }
    }
}