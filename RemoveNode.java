public class RemoveNode {
    public static void main(String[] args) {
        
    }
    public ListNode removeNodes(ListNode head) {
        ListNode tell=reverseNode(head);
        ListNode curr=tell;
        ListNode pre=tell;
        int max=Integer.MIN_VALUE;
        while(curr!=null){
                if (curr.val>max) {
                    max=curr.val;
                }else {
                    pre.next=curr.next;
                }
                pre=pre.next;
            curr=curr.next;
        }
        return reverseNode(tell);
    }
   
    private ListNode reverseNode(Listnode head){
        ListNode prv=null;
        ListNode curr=head;
        ListNode Next=head;
        while (curr!=null) {
            
            Next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=Next;
        }
       return prv;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode currhead=reverseNode(head);
        ListNode curr=currhead;
        ListNode prv=null;
        int c=0;
        while (curr!=null) {
            int val=(curr.val*2)+c;
            curr.val=val%10;
            c=val/10;
            prv=curr;
            curr=curr.next;
            
        }
        if (c!=0) {
            ListNode newNode=new ListNode(c);
            prv.next=newNode;
        }
        return reverseNode(currhead);
    }
}
