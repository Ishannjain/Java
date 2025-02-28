package Recursion;

public class party {
public static int invite(int n){
   
    if(n<=1){
        return 1;
    }
int single=invite(n-1);
int duo=invite(n-2)*(n-1);
return single + duo;
}
public static void main(String[] args) {
    System.out.println(invite(4));
}
}
