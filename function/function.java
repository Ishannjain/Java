package function;
import java.util.*;

public class function {
    public static void printMyName(String name){
System.out.println(name);
return;
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(sc);
        printMyName(name);
    }
}
