import java.util.Scanner;

class BinaryTree{
    BinaryTree(){
      
    }
    private class Node{
      int data;
      Node left;
      Node right;
     Node(int val){
       this.data=val;
         }
    }
    Node root =null;
 public  void buildTree(Scanner sc){
        System.out.println("Enter the value of root Node : ");
        int val = sc.nextInt();
        root = new Node(val);
        buildTree(sc,root);
    }
    public void buildTree (Scanner sc,Node root){
        System.out.println("Do you Want to insert the Left of "+root.data+" : ");
        boolean left =sc.nextBoolean();
        if(left){
        System.out.println("Enter the Left of "+root.data+" : ");
            int val= sc.nextInt();
            root.left=new Node(val);
            buildTree(sc,root.left);
        }
         System.out.println("Do you Want to insert the Right of "+root.data+" : ");
        boolean right =sc.nextBoolean();
        if(right){
        System.out.println("Enter the right of "+root.data+" : ");
            int val= sc.nextInt();
            root.right=new Node(val);
            buildTree(sc,root.right);
        }
    }
    void display(){
        inOrder(this.root);
    }
  public void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" - > ");
        inOrder(root.right);
    }



    
    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      Scanner sc =new Scanner(System.in);
     tree.buildTree(sc);
     tree.display();
    }
  }