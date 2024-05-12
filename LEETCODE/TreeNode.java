package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
     public static void main(String[] args) {
        
     }
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        
        TreeNode root=helper(preorder, inorder,map,0,inorder.length-1);
        return root;
     }
     int i=0;
     private TreeNode helper(int[] pre ,int[] in,HashMap<Integer,Integer> map,int si,int ei){
        if (si>ei) {
            return null;
        }
        if (si==ei) {
            return new TreeNode(pre[i++]);
        }
        
        TreeNode root = new TreeNode(pre[i++]);
        int idx= map.get(root.val);
        root.left=helper(pre, in, map, si,idx-1);
        root.right=helper(pre, in, map,idx+1, ei);
       return root;
     }

     public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
     
        if (p==null && q!=null) {
           return false; 
        }
        if (p!=null && q==null) {
            return false; 
         }

       if (p.val==q.val) {
        return  isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
       }else return false;

     }
    static int dia=-1;
      public static int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return -1;
        return helper(root);
    }
    private static int helper(TreeNode root) {
            dia=Math.max(dia, height(root.left)+height(root.right)+1);
            return dia;
    }
    private static int height(TreeNode root) {
            if (root==null) {
               return 0; 
            }
        int left=height(root.left);
        int right=height(root.right);
        return left+right+1;

    }
    public int findBottomLeftValue(TreeNode root) {
        if (root==null) {
            return -1;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
       int sol=0;
       while (!q.isEmpty()) {
         int row=q.size();
         for(int i=0;i<row;i++){
          TreeNode curr= q.poll();
          if (i==0) {
            sol=curr.val;  //left most
          }
          if (curr.left!=null) {
            q.add(curr.left);
          }
          if (curr.right!=null) {
            q.add(curr.right);
          }
         }
       }
       return sol;
    }
    
    
 }
  
 

   


