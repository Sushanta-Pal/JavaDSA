public class SortedArray {
    public static void main(String[] args) {
        int arr[]={2,3,2,5,6,7};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int idx) {
        if(idx == arr.length-1){
            return true;
        }
        return arr[idx] <= arr[idx+1] && isSorted(arr, idx+1);
    }
}
