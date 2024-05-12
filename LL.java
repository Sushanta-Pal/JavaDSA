public class LL {
    LL(){

    }
   private class Node
  {
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
  }
 Node head;
 public  void addFirst(int d){
    Node node = new Node(d);
    if (node==null) {
        head = node;
        return;
    }
    node.next=head;
    head =node;
 }
 public void display(){
    Node curr= head;
    while (curr!=null) {
        System.out.print(curr.data+" - > ");
        curr=curr.next;
    }
    System.out.println("null");
 }
 public boolean isPalindrome() {
    Node curr = head;
    Node mid = curr;
    
    // Find the middle of the linked list
    while (curr != null && curr.next != null) {
        mid = mid.next;
        curr = curr.next.next;
    }
    
    // Reverse the second half of the linked list
    curr = head;
    Node prv = null;
    Node C = mid;
    Node N;

    while (C != null) {
        N = C.next;
        C.next = prv;
        prv = C;
        C = N;
    }

    // Compare the first half with the reversed second half
    while (prv != null) {
        if (prv.data != curr.data) {
            return false;
        }
        prv = prv.next;
        curr = curr.next;
    }

    return true;
}

 public static void main(String[] args) {
    LL list = new LL();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(2);
    list.addFirst(1);
    list.display();
   System.out.println( list.isPalindrome());
 }

}
