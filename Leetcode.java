import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode {
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        int[] ans =buildArray(nums) ;
        System.out.println(Arrays.toString(ans));
    }
    private static int[] buildArray(int[] nums) {
        int ans [] = new int[nums.length];
        int j =0;
            for(int i :nums){
                ans[j] =nums[i];
                j++;
            }
        return ans;
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        if (curr==null || curr.next == null) {
            return curr;
        }
          ListNode nxt = curr.next;
          ListNode prv = curr;
          while (nxt.next!= null ) {
            prv =curr;
            curr =curr.next;
             nxt = nxt.next.next;
           
          }
           prv.next = curr.next;
           return head;
           

    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null ||head.next==null) {
            return head;
        }
        if (head.val!=head.next.val) {
            head.next=deleteDuplicates(head.next);
        }else if (head.val ==head.next.val) {
            ListNode tem =head;
            while (tem.next!=null && tem.val ==tem.next.val) {
                tem.next=deleteDuplicates(tem.next.next);
            }
            head =tem;
            
        }
        return head;
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        if (slow==null) {
            return false;
        }
        if (slow.next ==null) {
            return false;
        }
        if (fast.next.next==null) {
            return false;
        }
        slow =slow.next;
        fast=fast.next.next;
        while (fast!=null && slow!=fast ) {
            slow=slow.next;
            fast =fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        int l=0;
            ListNode curr = head;
            ListNode tail = head;
            while (curr!=null) {
                tail =curr;
                curr=curr.next;
                l++;
            }

        int place =k%l;
        if (place==0) {
            return head;  //No rotate Required
        }
        int i= l-place;
        curr = head;
        while (i>1) {
            curr= curr.next;
            i--;
        }
        tail.next=head;
        head=curr.next;
        curr.next=null;
        return head;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail =list2;
        while (tail.next!=null) {
            tail=tail.next;
        }
        ListNode curr =list1;
        while (curr!=null&& curr.next.val !=a) {
            curr=curr.next;
        }
        ListNode a =curr;
        while (curr!=null&& curr.val !=b) {
            curr=curr.next;
        }
        a.next=list2;
        tail.next=curr.next;
        return list1;
    }



    public int[] nextLargerNodes(ListNode head) {
     List<Integer> list = new ArrayList<>();
        while (head!=null) {
            
        }
     return list.toArray();
    }




    public boolean isSymmetric(TreeNode root) {
         if (root ==null) {
            return true;
         }
          Queue<TreeNode> queue =new LinkedList<>();
          queue.add(root.left);
          queue.add(root.right);
            while ( !queue.isEmpty()) {
                TreeNode l=queue.poll();
                TreeNode r=queue.poll();
                if (l==null && r==null) {
                    continue;
                }
                if (l==null ||r==null) {
                    return false;
                }
                if (l.val!=r.val) {
                    return false;
                }
                queue.add(l.left);
                queue.add(r.right);
                queue.add(l.right);
                queue.add(r.left);
            }
            return true;
    
     }  
     
     
     public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return (Math.max(l, r)+1);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        Treeanode root;
        int si=0;
        int ei=nums.length-1;
        root=sortedArrayToBST(nums,si,ei,root);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums,int si,int ei,TreeNode root) {
        if (si>ei) {
            return root;
        }
        int mid =(si+ei)/2;
        root=buildTree(nums[mid],root);
        root =sortedArrayToBST(nums,si,mid-1,root);
        root=sortedArrayToBST(nums,mid+1,ei,root);
        return root;
    }
    public TreeNode buildTree(int val,TreeNode root){
        if (root==null) {
            return TreeNode(val);
        }
        if(val<root.val) {  
            root.left=buildTree(val, root.left);
         }
         else  root.right =buildTree(val, root.right) ;
      return root;
    }


    public boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }
        return (Math.abs(Height(root.left)-Height(root.right))<2) && isBalanced(root.left) && isBalanced(root.right);

    }
    public int Height(TreeNode root){
        if (root==null) {
            return -1;
        }
        return (Math.max(Height(root.left), Height(root.right))+1);
    }


     public int minDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        int ans ;
        if(l!=0 && r!=0){
            ans =Math.min(l, r);
        }
        else ans =Math.max(l, r);
        return ans+1;
    }

}
