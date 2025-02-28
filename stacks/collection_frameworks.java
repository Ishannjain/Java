import java.util.Stack;

public class collection_frameworks {
    public static void main(String[] args) {
     
     Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(10);
        s.push(123);
        s.push(135);
        s.push(13);
        s.push(12);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
