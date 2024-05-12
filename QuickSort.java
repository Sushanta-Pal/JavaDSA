import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 2, 5, 6, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        // Choose the middle element as the pivot
        int m = si + (ei - si) / 2;
        int pivot = arr[m];

        int left = si;
        int right = ei;

        while (left < right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Recursively sort the two subarrays
        quickSort(arr, si, right);
        quickSort(arr, left, ei);
    }
}
