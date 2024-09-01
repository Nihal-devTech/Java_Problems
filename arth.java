public class arth {
    public static boolean isValid(String s){

        if(s == "s=()"){
            return true;
        }else if(s == "s={}"){
            return true;
        }else if(s == "s=[]"){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("s=()[]{}"));
    }
}