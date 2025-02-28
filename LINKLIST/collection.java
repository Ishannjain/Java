package LINKLIST;
import java.util.*;
public class collection {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.add("list");
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
