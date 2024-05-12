package vscode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import vscode.TreeNode;
    
public class Bt {
     private int i;
   Bt(){
  this.i =-1;
   }
     public TreeNode createNode(int data[]){
        i++;
          if (i>=data.length ||data[i]==-1) {
            return null;
          }
          TreeNode Node =new TreeNode(data[i]);
             
            Node.left=createNode(data);
            Node.right =createNode(data);
        
         return Node;
     }
     void preOrder(TreeNode root){
        if (root==null) {
           // System.out.println();
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

     }
     void postOrder(TreeNode root){
        if (root==null) {
          // System.out.println();
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

     }
     void inOrder(TreeNode root){
        if (root==null) {
          // System.out.println();
            return;
        }
       
        inOrder(root.left);
         System.out.print(root.data+" ");
       inOrder(root.right);

     }
     void levelOrder(TreeNode root){
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
        
     }

    public static void main(String[] args) {
       int data[] ={1, 2, 3, 5, -1, -1, -1, 4, -1, -1, 6, 7, 8, 9, -1, -1, 10, -1, -1, -1, -1};
        Bt tree = new Bt();
        TreeNode root = tree.createNode(data);
       // System.out.println(root.data);
        // tree.preOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        tree.levelOrder(root);

    }
}

public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) {
          return 0;
        }
        int ans=0;
       helper(root,ans);
       return ans;
}
private void helper(TreeNode root, int ans) {
  if (root==null) {
    return;
  }
  if (root.left!=null) {
    ans+=root.left.val;
    helper(root.left, ans);
  }
  helper(root.right, ans);
 
}


public int sumNumbers(TreeNode root) {
    return dfs(root,0) ;  
}
private int dfs(TreeNode root, int sum) {
  if (root==null) {
    return 0;
  }
        sum=sum*10+root.val;
        if (root.left==null && root.right==null) {
          return sum;
        }
        return dfs(root.left, sum)+dfs(root.right, sum);
  }