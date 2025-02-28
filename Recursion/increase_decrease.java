package Recursion;

public class increase_decrease

{
public static void numbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        numbers(n-1);

    }
public static void increase(int n){
    if(n==6){
        return;
    }
    System.out.println(n);
    increase(n+1);
}
 public static void main(String[] args) {
        numbers(5);
        increase(1);
    }
}