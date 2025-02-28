package Recursion;

public class firstlastoccu {
    public static int first=-1;
    public static int last=-1;
   public static void findoccurence(String str,int idx,char element){
    if(idx==str.length()){
System.out.println(first);
System.out.println(last);
        return;
    }
    char currchar=str.charAt(idx);
    if(currchar==element){
        if(first==-1){
            first=idx;
        }else{
            last=idx;
        }
    }
    findoccurence(str, idx+1, element);
   }
    public static void main(String[] args) {
        String str="abhcghha";
        findoccurence(str, 0, 'a');
    }
}
