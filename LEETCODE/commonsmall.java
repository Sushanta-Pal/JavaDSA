import java.util.ArrayList;
import java.util.List;

public class commonsmall {
    public static void main(String[] args) {
        
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]==nums2[j]) {
                return nums1[i];
            }
            else if (nums1[i]<nums2[j]) {
                i++;
            }else j++;
        }
        return -1;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] arr= new int[1001];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if (arr[nums2[i]]!=0) {
                list.add(nums2[i]);
                arr[nums2[i]]=0;
            }
        }
        int [] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        array[i] = list.get(i);
        return array;
    }
}
