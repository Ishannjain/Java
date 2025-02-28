
import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sc);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int[ ][]marks=new int[rows][column];
       for(int i=0;i<rows;i++){
        for(int j=0;j<column;j++){
        marks[i][j]=sc.nextInt();
       }}
       
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
            System.out.println(marks[i][j]);
        }
    System.out.println();}
    }
}
