import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class arraylist {
   static class Stack{
           static  ArrayList<Integer> list=new ArrayList<>();
            public static boolean isempty(){
               return  list.size()==0;

            }
            public static void push(int data){
                list.add(data);
            }
            public static int pop(){
                if(isempty()){
                    return -1;
                }
                int top=list.get(list.size()-1);
               list.remove(list.size()-1);
               return top; 
            }
public static int peek(){
    if(isempty()){
        return -1;
    }
    return list.get(list.size()-1);
}
    }
    public static void main(String[] args) {
     
        Stack s=new Stack();
        s.push(1);
        s.push(10);
        s.push(123);
        s.push(135);
        s.push(13);
        s.push(12);

        while(!s.isempty()){
            System.out.print(s.peek());
            s.pop();
        }
}
}
