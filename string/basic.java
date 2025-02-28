package string;
// import java.util.*;
public class basic {
    public static void main(String[] args) {
        String name="ishan";
        System.out.println(name);
        // Scanner sc=new Scanner(System.in);
        // String fullname= sc.nextLine();
        // System.out.println(fullname);
        //concatentaion
        String first="ishan";
        String second="jain";
        String finals= first + " " +second;
        System.out.println(finals);
        //length
        System.out.println(finals.length());
        //charat
        for(int i=0;i<finals.length();i++){
System.out.println(finals.charAt(i));
        }
    }
}
