package Recursion;

public class sum {
    public static int  sumoffirst(int n) {
        if(n==0){
            return 0;
        }
        
            int h= n + sumoffirst(n-1);
        // System.out.println(h);
        return h;
        

    }
    public static void main(String[] args) {
         int ans=sumoffirst(5);
         System.out.println(ans);
    }
}
