package Recursion;

public class subsequence
 {
    public static void sunsequences(String str,int idx ,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        sunsequences(str, idx+1, newString+currchar);
        sunsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="avcd";
        sunsequences(str, 0, "");


    }
}
