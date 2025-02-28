package bitmanipulation;

public class set {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitmask=1<<pos;
        int newnumber=bitmask | n;
        System.out.println(newnumber);  
}
}
