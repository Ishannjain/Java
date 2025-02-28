package hashing;
import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(1);
//search-contains
if(set.contains(1)){
    System.out.println("sets contains");
}
if(!set.contains(6)){
    System.out.println("dosent contains");
}
//delete
set.remove(1);
if(!set.contains(1)){
    System.out.println("doesnot contains 1");
}
//size
System.out.println(set.size());
System.out.println(set);


//iterator
Iterator it=set.iterator();
//hasnext;next
while(it.hasNext()){
    System.out.println(it.next());
}
    }
}
