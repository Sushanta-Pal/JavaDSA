public class Sumtrianglefromarray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        printTrangle(arr,arr.length-1);
    }

    private static void printTrangle(int[] arr, int n) {
        if (n<1) {
            return;
        }
        int tem []=new int[n-1];
        for(int i=0;i<n-1;i++){
            tem[i] = arr[i]+arr[i+1];
        }
        printTrangle(tem,n-1);
       for(int i: arr)
       {
        System.out.printf("%d  ",i);
       }
       System.out.println();

    }
}
