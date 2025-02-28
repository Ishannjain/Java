package bitmanipulation;
import java.util.*;
public class update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        System.out.println(sc);
        int n=5;
        int pos=1;
        if(op==1){
            int bitmask=1<<pos;
        int newnumber=bitmask | n;
        System.out.println(newnumber); 
        }else{
            int bitmask=1<<pos;
        int newnumber=~(bitmask) & n;
        System.out.println(newnumber);  
        }
}
}

