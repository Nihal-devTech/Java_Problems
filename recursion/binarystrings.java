public class binarystrings {
    
    public static void binary(int n, int lastplace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //logic

             binary(n-1, 0, str+"0");
             
        if(lastplace==0){
            binary(n-1, 1,str+"1");
        }
       
        
    }
    
    public static void main(String args[]){
        int n=3;
        int lastplace=0;
        String str="";
        binary(n,lastplace,str);
    }
}
