package Recursion;

public class checksort {
    public static Boolean functions(int idx,int array[]){
        if(idx==array.length-1){
            return true;
        }
if (array[idx]<array[idx+1]){
     return functions(idx+1,array);

}else{
    return false;
}
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
       System.out.println( functions(0,array));
    }
}
