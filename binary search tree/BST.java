public class BST{
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
        
    } 
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            insert(root.left,val);
        }else{
        insert(root.right,val);
    }
return root;
}
public static Node delete(Node root,int val){
    if(root.data>val){
        root.left=delete(root.left,val); 
    }else if(root.data<val){
        root.right=delete(root.right,val);
    }else{
        //case 1
        if(root.left==null && root.right==null){
            return null;
        }
        //case 2
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        //case 3
        Node IS=inordersuccessor(root.right);;
        root.data()=IS.data;
        root.right=delete(root.right, IS.data);
    }
    return root;
}
public static Node inordersuccessor(Node root){
while(root.left!=null){
    root=root.left;
}
return root;
}
public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data>key){
        return search(root.left,key);	
    }
    else if(root.data==key){
        return true;
    }
        return search(root.rigt,key);
    
}
public static void printinrange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        printinrange(root.left, x, y);
        System.out.println(root.data);
        printinrange(root.right,x,y);
    }
    else if(root.data>=y){
        printinrange(root.left,x,y);	

    }else{
printinrange(root.right, x, y);

    }
}
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
}oot
public static void main(String[] args) {
    int values[]={5,1,3,4,2,7};
Node root=null;
for(int i=0;i<values.length;i++){
    root=insert(root,values[i]);}
    inorder(root);
    if(search(root,1)){
        System.out.println("found");

    }else{
        System.out.println("not found");
    }
}
}
