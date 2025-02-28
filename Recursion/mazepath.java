package Recursion;

public class mazepath {
    public static int path(int cr,int cc,int er,int ec){
       if(cr==er || cc==ec){
        return 0;
       }
        if(cr==er-1 && cc==ec-1){
        return 1;
        }
       
            int rightways=path(cr+1,cc,er,ec);
           int  leftways=path(cr, cc+1, er, ec);
         int total=rightways+leftways;
         return total;


    }
    public static void main(String[] args) {
       System.out.println( path(0,0,3,3));
    }
}
