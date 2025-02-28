package Recursion;
import java.util.*;

import string.reverse;

public class check_palindrome {
    public static void reverse(String s,int idx,String newstr){
        if(idx==0){
          newstr+=s.charAt(idx);
            return;
        }
        newstr+=s.charAt(idx);
        reverse(s,idx-1,newstr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String newstr="";
        reverse(s,s.length(),newstr);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=newstr.charAt(i)){
                System.out.println(false+"string is not palindrome");
            }else{
                System.out.println("string is palindrome");
            }
        }
    }
}
