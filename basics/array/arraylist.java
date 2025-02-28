import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        // ArrayList<String> list2=new ArrayList<String>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get elements
       int element= list.get(1);
       System.out.println(element);
       //add el in between
       list.add(1,1);
       System.out.println(list);
       //set elements
       list.set(0,5);
       System.out.println(list);
       //delete elements
       list.remove(0);
       System.out.println(list);
       //size of list
       int size=list.size();
       System.out.println(size);
       //loops
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
      System.out.println();
      Collections.sort(list);
    }
}

