/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
        HashSet<Integer> vis;
    public FindElements(TreeNode root) {
        vis=new HashSet<>();
        make_Tree(root,0);
    }
    
    public boolean find(int target) {
        return vis.contains(target);
    }
    void make_Tree(TreeNode curr,int val){
        if(curr==null) return;
        vis.add(val);
        make_Tree(curr.left,val*2+1);
        make_Tree(curr.right,val*2+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */