public class duplicate {
    
    public static void duplicatestrings(String str ,int idx,  StringBuilder newStr, boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }

        //kaam
        char currchar = str.charAt(idx);

        if(map[currchar - 'a']==true){
            duplicatestrings(str , idx+1 , newStr , map);
        }
        else{
            map[currchar - 'a']=true;
            duplicatestrings(str , idx+1 , newStr.append(currchar) , map);
        }

    }

    public static void main(String args[]){
        String str = "nihhahal";

        duplicatestrings(str, 0 , new StringBuilder(""), new boolean[26]);
    }
}
