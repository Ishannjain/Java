import java.util.*;
public class HashMap{
    static class HashMap<k,v>{//generics
        private class Node{
            k key;
            v value;
            public Node (k key, v value){
                this.key=key;
                this.value=value;
                
            }
        }
        private int n;
        private int N;//buckets.length
        @SuppressWarnings("unchecked")
        . HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();

            }
    }
    private int hashfunction(k key) {
    int bucket_index= key.hashCode();
    return Math.abs(bucket_index)%N;
    }
    private int searchInLL(k key, v bucket_index){
        LinkedList<Node> ll=buckets[bucket_index];
       
        for(int i=0;i<ll.size;i++){
            if(ll.get(i).key==key){
                return i;
            }
        }
        return -1;

    }
    private void rehash(){
        LinkedList<Node> oldbucket[]=buckets;
        buckets=nw LinkedList[n*2];
        for(int i=0;i<N*2;i++){
            bucket[i]= new LinkedList<>();
                }
        for(int i=0;i<oldbucket.length;i++){
            LinkedList<Node> ll=oldbucket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }
    }
public void put(k key,v value){
   int bucket_index=hashfunction(key);
   int data_index= searchInLL(key,bucket_index);//data index//di=0+->key exist and else di=-1->key doesn't exist
   if(data_index==-1){
    bucket[i].add(new Node(key,value));
    n++;
     
   }else{
    Node data=buckets[bucket_index].get(data_index);
    node.value=value;
   }
   double  lambda=(double)n/N;
   if(lambda>2.0){
    //re-hashing
   }
}
public boolean containsKey(k key){
    return false;
}
public v remove(k key){
    return null;
}
public ArrayList<k> keyset() {
    return null; //return

}
public boolean isEmpty() {
    return false;
}
    }

public static void main(string[] args) {
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    map.put("india",12390);
    map.put("china",12393450);
    map.put("ipak",1245790);
}
}