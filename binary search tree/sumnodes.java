import java.util.*;
public class sumnodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }}
        static class BinaryTree{
            static int idx=-1;
            public static Node buildTree(int nodes[]){
                    idx++;
                    if(nodes[idx]==-1){
                        return null;
                    }
                    Node newNode =new Node(nodes[idx]);
                    newNode.left=buildTree(nodes);
                    newNode.right=buildTree(nodes);
                    return newNode;
            }
        }
        public static void  preorder(Node root){
            if(root==null){
                return;
            }
         System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
       
            inorder(root.right);
        }
    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
   
        
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
              System.out.println();
              if(q.isEmpty()){
                break;

              }else{
                q.add(null);
              }
            }else{
                System.out.print(currNode.data+"  ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int sumofNOdes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofNOdes(root.left);
        int rightsum =sumofNOdes(root.right);
        return leftsum+rightsum+root.data;
    }
 static class TreeInfo{
    int height;int dia;
    TreeInfo(int height,int dia){
        this.height=height;this.dia=dia;
    }
 }
 public static TreeInfo diameter2(Node root){
    if(root==null){
        return new TreeInfo(0, 0);

    }
    TreeInfo left=diameter2(root.left);
    TreeInfo right=diameter2(root.right);
    int myheight=Math.max(left.height,right.height)+1;
    int diam1=left.dia;
    int diam2=right.dia;
    int diam3=left.height+right.height+1;
    int mydia=Math.max(Math.max(diam1,diam2),diam3);
    TreeInfo myinfo=new TreeInfo(myheight,mydiam);
    return myinfo;

 }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
       Node root=tree.buildTree(nodes);
       System.out.println(root.data);
       preorder(root);
       System.err.println("");
       inorder(root);
       System.err.println("");
       postorder(root);
       System.err.println("");
       levelorder(root);
       System.out.println(sumofNOdes(root));
       System.out.println(diameter2(root).dia);

    }
}
