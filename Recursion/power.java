package Recursion;

public class power {
    public static int powerfunc(int x,int n){
    if(n==0){
        return 1;
    }
    if (n==0){
        return 0;
    }
    int h=x*powerfunc(x, n-1);
    return h;

    }
    public static void main(String[] args) {
        int ans=powerfunc(2, 5);
        System.out.println(ans);
    }
}