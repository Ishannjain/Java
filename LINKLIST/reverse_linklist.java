package LINKLIST;
import java.util.*;

public class reverse_linklist {
    
    private int size;
    reverse_linklist(){
        this.size=0;
    }
    class Node{
String data;
Node next;
Node(String data){
    this.data=data;
    this.next=null;
    
}
    Node head;
     public void reverseIterate(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
Node nextNode=currNode.next;
currNode.next=prevNode;
prevNode=currNode;
currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
     }
     public Node reverseRecursive(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

     }
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        System.out.println(list.reverseRecursive(list.head));
        // list.reverseIterate();
    
    }
}
}