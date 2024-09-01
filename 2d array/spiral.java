public class spiral {

    public static void printSpiral(int matrix[][]){
        int sr=0;   //starting row
        int sc=0;   //starting coloumn
        int er=matrix.length-1; //ending row
        int ec=matrix[0].length-1;  //ending coloumn

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc ; j<=ec ; j++){
                System.out.print(matrix[sr][j]+" ");

            }

            //right
            for(int i=sr+1 ; i<=er ; i++){
                System.out.print(matrix[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1 ; j>=sc ; j--){
                if(sr==er){     //same numbers repeatedly print nhi hone duga
                    break;
                }
                System.out.print(matrix[er][j]+" ");
            }
            //left
            for(int i=er-1 ; i>=sr+1 ; i--){
                if(sc==ec){   //same numbers repeatedly print nhi hone duga
                    break;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            
            sr++;
            er--;
            sc++;
            ec--;
        }
    }

    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
