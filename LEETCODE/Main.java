package LEETCODE;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
       preorderTraversal(root,list);
       return list;
    }
    public static void preorderTraversal(TreeNode root,List<Integer> list) {
      if (root==null) {
        return;
      }
      list.add(root.val);
      preorderTraversal(root.left);
      preorderTraversal(root.right);
    }
    public int[] findMode(TreeNode root) {
      return null;
        
    }

   public static void main(String[] args) {
    TreeNode tree = new TreeNode();
    preorderTraversal(tree);
    
   } 
}
