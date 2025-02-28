package Recursion;

public class fibinacci {
    public static int calcfio(int n){
        if(n==1 || n==2){
            return 1;
        }
        
        int h= calcfio(n-1)+calcfio(n-2);
        return h;
    }
    public static void main(String[] args) {
        int ans =calcfio(7);
        System.out.println(ans);
    }
}
