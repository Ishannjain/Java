package Recursion;

public class movingstring {
    public static void movingstrings(String str,int idx,int count,String newString,char ele){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+=ele;
            }
            System.out.println(newString);
            return;
        }
       char currchar=str.charAt(idx);
       if(currchar==ele){
        count++;
        movingstrings(str, idx+1, count, newString, ele);
       }else{
        newString+=currchar;
        movingstrings(str, idx+1, count, newString, ele);
       }

    }
    public static void main(String[] args) {
        String str="acvnmb";
        movingstrings(str,0,0,"",'v');
    }
}
