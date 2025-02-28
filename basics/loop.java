import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(sc);
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        int i=0;
        while(i<11){
            System.out.println(i);
            i++;
        }

    }
}
