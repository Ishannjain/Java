package LINKLIST;
import java.util.*;
public class reverse_a_linklist {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        LinkedList<String> newlist=new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            newlist.addFirst(list.get(i));
        }
        System.out.println(newlist);
        
    }
}
