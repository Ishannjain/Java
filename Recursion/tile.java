package Recursion;

public class tile {
    public static int printtiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(m>n){
            return 1;
        }
       int vertical= printtiles(n-m, m);
       int horizontal=printtiles(n-1, m);
       return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(printtiles(4, 2));
    }
}

