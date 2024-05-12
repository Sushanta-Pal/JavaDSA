public class removeNode {
    public static void main(String[] args) {
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode curr=head;
        while (curr!=null) {
            curr=curr.next;
            size++;
        }
        if (size==n) {
            return head.next;
        }
        curr=head;
        for(int i=size-n;i>1;i--){
            curr=curr.next;
        }if (curr.next!=null) {
            curr.next=curr.next.next;
        }
        
        return head;
    }

    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null) {
            return false;
        }
        ListNode curr=head;
        ListNode N=head.next;

        while (N!=null&&N.next!=null) {

            if (N==curr) {
                return true;
            }
            if(N.next!=null)
            N=N.next.next;
            curr=curr.next;
        }
        return false;

    }
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        ListNode N=head;

        while (N!=null &&N.next!=null) {
            curr=curr.next;
            N=N.next.next;
        }
        return curr;
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1;

        for(int i=0;i<a;i++){
            curr=curr.next;
        }
        ListNode a=curr;
        for(int i=a;i<=a;i++){
            curr=curr.next;
        }
        ListNode v=list2;
        a.next=list2;
        while (v.next!=null) {
            v=v.next;
        }
        v.next=curr;



    }


}
