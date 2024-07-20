public class L2058 {
    public static void main(String[] args) {
        
    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        if (head==null || head.next==null ||head.next.next ==null) {
            return res;
        }
        int min=0,max=0,mean=Integer.MAX_VALUE,mid=0;
      
        ListNode p=head;
        head=head.next;
        int count=2;
        while (head.next!=null) {
            
            if ((p.val<head.val && head.next.val<head.val)|| (p.val>head.val && head.next.val>head.val)) {
                //critical node
                if (min==0) {
                    min=count;
                }
                else if (max==0) {
                    max=count;
               }
               else {
                mid=max;
                max=count;
               }
               if (max!=0) {
                mean=Math.min(mean, max-min);
                mean=Math.min(mean, max-mid);
               }
            }
           
            p=head;
            head=head.next;
            count++;
        }
        if (max==0) {
            return res;
        }
            if (mid==0) {
                res[0]=mean;
                res[1]=max-min;
            }else{
            res[0]=mean;
            res[1]=max-min;
            }
            return res;


    }
}
