package hashmap;

import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        
    
    //country(key), population(value)
    HashMap<String,Integer> map=new HashMap<>();
  //insertion
  map.put("India",120);
  map.put("CHINA",56);
  System.out.println(map);
  //update
  map.put("CHINA",156);
  System.out.println(map);
  //search
  if(map.containsKey("CHINA")){
    System.out.println("correct");
  }else{
    System.out.println("not correct");}
    System.out.println(map.get("CHINA"));
  //iterator
  int arr[]={12,23,45};
  for(int i=0;i<3;i++){
    System.out.println(arr[i]);
  }
  for(int val:arr){
    System.out.println(val);
  }
// for(map.Entry<String,Integer>e:map.entrySet()){
//     System.out.println(e.getkey());
//     System.out.println(e.getValue());
// }

}}
