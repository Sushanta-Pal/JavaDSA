import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sum =new TwoSum();
        int nums[]={2,7,11,15};
        int target =9;
       int ans[]= sum.twoSum(nums,target);
    }
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
         int i=0;
         int j=nums.length-1;
         while (nums[i]>target) {
            i++;
         }
         while (nums[j]>target) {
            j--;
         }

        return ans;
    }
    
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> hs = new HashSet();
        for(int i :nums){
            if (hs.contains(i)) {
                return true;
            }
            hs.add(i);
        }
       return false;
    }
}
