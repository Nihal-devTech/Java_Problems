import java.lang.Math;
public class direction {

    public static float path(String path){ //types cast krna pda//

        //initializing coordinates
        int x=0;
        int y=0;

        //loop chalalo har char kotraverse krne k liye
        for(int i=0 ; i<path.length() ; i++){

            //har char ko recognize krne k liye 
            char dir=path.charAt(i);

            //west
            if(dir == 'W'){
                x++;
            }

            //east
            if(dir == 'E'){
                x--;
            }

            //north
            if(dir == 'N'){
                y++;
            }

            //south
            if(dir == 'S'){
                y--;
            }
        }


        int X2 =x*x; //x^2
        int Y2 =y*y; //y^2

        return (float)Math.sqrt(X2+Y2);//type cast krna pda 
    }

    public static void main(String args[]){
        String direct ="WEESSN";

        System.out.println(path(direct));

    }
}
