import java.util.ArrayList;
import java.util.List;

public class AddTwo {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     int tem =0;
    //         ListNode sum = new ListNode()
    //         while(l1.next!=null &&l2.next!=null) {
                
    //         }


    // }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int n =(int)(Math.log(x)/Math.log(10))+1;
        int arr[] = new int[n];
        int i=0;
        while(x>0)
        {
        arr[i++]=x%10;
        x/=10;
        }
        for(i=0;i<arr.length/2 ;i++){
                if (arr[i]!=arr[arr.length-1-i]) {
                    return false;
                }
        }
        return true;
        
    }
    public ListNode swapPairs(ListNode head) {
        ListNode curr =head;
        if (curr==null) {
            return head;
        }
        ListNode nxt =head.next;
        while (curr!=null && nxt!=null) {
            int tem =curr.val;
            curr.val =nxt.val;
            nxt.val=tem;
            curr=nxt.next;
            if (curr!=null) {
                nxt =nxt.next.next;
            }
            
        }
        return head;

    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
    if (curr==null || curr.next==null) {
        return curr;
    }
        ListNode nxt = curr.next;
        

    }
    
}
