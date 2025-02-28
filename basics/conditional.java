import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
        int age=sc.nextInt();
        if (age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("child");
        }
    }
}
