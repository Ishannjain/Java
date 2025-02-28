package LINKLIST;
public class first {
    Node head;
    private int size;
    first(){
        this.size=0;
    }
    class Node{
String data;
Node next;
Node(String data){
    this.data=data;
    this.next=null;
    
}
    }
    //add-first,last
    public void addfirst(String data){
        Node newNode=new Node(data);
if(head == null){
head=newNode;
return;

}
newNode.next=head;
head=newNode;
size++;
    }
    //add-last
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head == null){
        head=newNode;
        return;
    }
Node currNode=head;
 while(currNode.next !=null){
currNode=currNode.next;
} 
currNode.next=newNode;
}
public void printList(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
while(currNode.next !=null){
    System.out.print(currNode.data+ "->");
currNode=currNode.next;
} 
System.out.println("Null");
}
//delete
public void deletefirst(){
    if(head==null){
        System.out.println("this list is empty");
    }
    size--;
    head=head.next;
}
public void deletelast(){
    if(head==null){
        System.out.println("this list is empty");
    }
    size--;

    if(head.next==null){
        head=null;
        return;
    }
    Node secondlast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null)
{
    lastNode=lastNode.next;
    secondlast=secondlast.next;
}
secondlast.next=null;}
//size
public int getsize(){
    return size;
}
public static void main(String[] args) {
        first list=new first();
list.addfirst("a");
list.addfirst("is");
list.printList();
list.addlast("list");
list.printList();
list.addfirst("this");
list.printList();
list.deletefirst();
list.printList();
// list.deletelast();
// list.printList();
System.out.println(list.getsize());
    }      
}
