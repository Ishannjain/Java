package Recursion;

// import bitmanipulation.set;
import java.util.HashSet;
public class hashsets

 {
    public static void sunsequences(String str,int idx ,String newString,HashSet<String> Set){
        if(idx==str.length()){
            if(Set.contains(newString)){
           
            return;
        }else{
            System.out.println(newString);
            Set.add(newString);
            return;
        }
    }
        char currchar=str.charAt(idx);
        sunsequences(str, idx+1, newString+currchar,Set);
        sunsequences(str, idx+1, newString,Set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> Set=new HashSet <>();
        sunsequences(str, 0, "",Set);


    }
}
 
