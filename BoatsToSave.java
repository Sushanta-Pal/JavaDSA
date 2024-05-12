
import java.util.Arrays;



public class BoatsToSave {
    public static void main(String[] args) {
       int[] people = {3,5,4,3};
       int limit = 5;
       System.out.println(new BoatsToSave().numRescueBoats(people, limit));
    }
    public int numRescueBoats(int[] people, int limit) {
       
        Arrays.sort(people);
        int boat=0;
           int i=0;
           int j=people.length-1;
           while (i<=j) {
            if (people[i]+people[j]<=limit) {
                i++;
            
            }
            j--;
            boat++;

           }
        return boat;
        
    }
}


public void deleteNode(ListNode node) {
       ListNode prv=node;
       while(node.next!=null){
        node.val=node.next.val;
           prv=node;
        node=node.next;
       }
       prv.next=null;

}
