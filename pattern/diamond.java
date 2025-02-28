public class diamond{
public static void main(String[] args) {
    int x=5;
    for (int i=1;i<=x;i++){
        for (int j=1;j<=x-i;j++){
            System.out.print(" ");
        }
        for (int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    for(int i=x;i>=1;i--){
        for (int j=1;j<=x-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
 
}