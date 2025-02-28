import java.util.*;
public class iternary{
    public static String getstart(HashMap<String,String> tick){
    HashMap<String,String> revmap=new HashMap<String,String>();
    for(String key: tick.KeySet()){
        revmap.put(tick.get(key), key);
    }
    for(String key: tick.keySet()){
        if(!revmap.containsKey(key)){
            return key;
        }
    }
    return null;
    }
    public static void main(String[] args){
        HashMap<String,String> tickets = new HashMap<String,String>();
        tickets.put("c","b");
        tickets.put("m","d");
        tickets.put("g","c");
        tickets.put("d","g");
String start=getstart(tickets);
while(tickets.containsKey(start)){
    System.out.println(start);
    start=tickets.get(start);
}
System.out.println(start);
    }
}