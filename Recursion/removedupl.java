package Recursion;

public class removedupl {
    // public static boolean[] map=new boolean[26];
    public static void removeduplicates(String str,int idx,String newString){
        boolean map[]=new boolean[26];
        
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeduplicates(str, idx+1, newString);

        }else{
            newString+=currchar;
            map[currchar-'a']=true;
            removeduplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="acvffd";
        removeduplicates(str, 0, "");
    }
}
