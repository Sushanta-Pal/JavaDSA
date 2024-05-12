import java.util.Arrays;

public class GFG {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }

    private static int minJumps(int[] arr) {
        int N =arr.length-1;
        int count=0;
        for(int i=0;i<=N;){
            count++;
                int max=arr[i];
                if (max>=N-i) {
                    return count;
                }
                for(int j=i+1;j<arr[i];j++){
                    if (max<arr[j]) {
                        max=arr[j];
                        if (max>=N-i-j) {
                    return count+1;
                }
                    }
                }
                i=i+max;
        }
        return -1;
    }
}
boolean isBST(Node root)
    {
        if (root==null) {
            return true;
        }if (root.left!=null) {
             if( root.left.data<root.data || root.right==null){
            return true;
        }
        }
       
       if (root.right!=null) {
         if(root.right.data>root.data || root.left==null){
            return true;
        }
       }
        if (root.data>root.left.data && root.data>root.right.data) {
           return isBST(root.left)&&isBST(root.right);
        }
  return false;
        
    }
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int max=arr[0]+k;
        int min=arr[0]-k;
        for(int i=1;i<n;i++){
                if (max<arr[i]+k) {
                    max=arr[i]+k;
                }
                if (min>arr[i]-k) {
                    min=arr[i]-k;
                }
        }
        return (max -min);
    }

    int countX(int L, int R, int X) {
        // code here
        
    }

    boolean isBalanced(Node root)
    {
        if (root==null ) {
            return true;
        }
        return (Math.abs(Height(root.left)-Height(root.right))<=1) && isBalanced(root.left) && isBalanced(root.right);
	
    }
    private int Height(Node node){
        if (node==null) {
            return 0;
        }
        return Math.max(Height(node.left),Height(node.right))+1;
    }


    	public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if (arr[j-1]>arr[j]) {
                    int t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i=0;
        int j=M-1;
        while (i<N && j>=0) {
            if (mat[i][j]==X) {
                return 1;
            }
            if (mat[i][j]<X) {
                i++;
            }
            else j--;
        }
        return -1;


    }


    boolean isPalindrome(Node head) 
    {
        Node curr =head;
        Node mid= curr;
        while (curr!=null  &&curr.next!=null) {
            mid=mid.next;
            if (curr.next!=null) {
                curr=curr.next.next;
            }else curr=curr.next;
           
        }
        curr =head;
        Node prv =null;
        Node C=mid.next;
        Node N=C.next;
        while (C!=null) {
          C.next =prv;
          prv=C;
          C=N;
          if (N!=null) {
             N=N.next;
          }
         
        }
        while (prv!=null) {
            if (prv.val!= curr.val) {
                return false;
            }
        }
  return true;


    }  