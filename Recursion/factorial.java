package Recursion;

public class factorial {
    public static int factorials(int n){
if (n==1 || n==0){
    return 1;
}
int h=n*factorials(n-1);
    return h;

    }
    public static void main(String[] args) {
        int factorial=factorials(6);
        System.out.println(factorial);
    }
}
