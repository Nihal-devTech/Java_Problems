import java.util.Scanner;
public class creation{
    public static boolean search(int matrix[][],int key){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("found the element at "+i+","+j);
                    return true;
                }
            }
        }
        System.out.print("not found");
        return false;
    }

    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length; j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                }
            }

            return largest;
            
        }

    public static void print(int matrix[][]){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]=new int[3][3];

        Scanner sc= new Scanner(System.in);
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        
        System.out.println(largest(matrix));
        

        

    }
}
