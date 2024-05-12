package vscode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
int data;
TreeNode left;
TreeNode right;
TreeNode(int data){
    this.data =data;
    this.left=null;
    this.right=null;
}
    
}

public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null) {
            return list;
        }
       list.addAll(inorderTraversal(root.left));
       list.add(root.val);
       list.addAll(inorderTraversal(root.right));

        return list;
}
 public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        if (p==null && q !=null) {
            return false;
        }
         if (q==null && p !=null) {
            return false;
        }
        return (p.val==q.val) && isSameTree(p.left, q.left) &&isSameTree(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
          if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
              list.add(current.data);
            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
                
        }
   
         }
    private boolean helper(List<Integer> list) {
        for(int i=0;i<list.size()/2;i++){
                if (list.get(i)!=list.get(list.size()-i-1)) {
                    return false;
                }
        }
        return true;
    }