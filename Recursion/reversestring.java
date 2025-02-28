package Recursion;

public class reversestring {
    public static void printstr(String str,int idx) {
        if (idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printstr(str, idx-1);

    }
    public static void main(String[] args) {
        String str="abcd";
        printstr(str, str.length()-1);
    }
    
}
