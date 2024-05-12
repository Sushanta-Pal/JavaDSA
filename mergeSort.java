import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={2,-3,4,5,0,1,-4};
        int ans[]=MargeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
        mergeSortIdx(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortIdx(int[] arr, int si, int ei) {
            if (si==ei) {
                return;
            }
            int m= si+(ei-si)/2;
            mergeSortIdx(arr,si,m);
            mergeSortIdx(arr,m+1,ei);
            merge(arr,si,m,ei);
            
    }

    private static void merge(int[] arr, int si, int m, int ei) {
        int sort[]=new int[ei-si+1];
        //Merging two Array in sorted order
            int i=si;
            int j=m+1;
            int k=0;
            while (i<m+1 && j<ei+1) {
                if (arr[i]<=arr[j]) {
                    sort[k++] =arr[i++];
                }
                else sort[k++] =arr[j++];
            }
            while (i<m+1) {
                sort[k++] =arr[i++];
            }
            while (j<ei+1) {
                sort[k++] =arr[j++];
            }
            for(int l=0;l<sort.length;l++){
                    arr[si+l]=sort[l];
            }
        
    }

    private static int[] MargeSort(int[] arr) {
        if (arr.length==1) {
            return arr;
        }
       int mid =arr.length/2;
       int left[]=MargeSort(Arrays.copyOfRange(arr,0,mid));
       int right[]=MargeSort(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int sort[]=new int[left.length+right.length];
            //Merging two Array in sorted order
            int i=0;
            int j=0;
            int k=0;
            while (i<left.length && j<right.length) {
                if (left[i]<=right[j]) {
                    sort[k++] =left[i++];
                }
                else sort[k++] =right[j++];
            }
            while (i<left.length) {
                sort[k++] =left[i++];
            }
            while (j<right.length) {
                sort[k++] =right[j++];
            }

        return sort;
    }
}
