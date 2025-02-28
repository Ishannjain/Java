
import java.util.*;

public class reverse{
    public static void  pushatbottom(int data,Stack<Integer> s)
    {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(data, s);
        s.push(top);

    }
    public static void reverses(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverses(s);
        pushatbottom(top,s);
        
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(56);
        s.push(3);
     reverses(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
