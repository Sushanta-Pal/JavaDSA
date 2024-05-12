import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            List<Integer> l=new ArrayList<>();
            l.add(nums[i]);
            int ans=twosum(nums,i);
            if (ans!=i) {
                l.add(nums[ans]);
                l.add(-1*(nums[i]+nums[ans]));
            }
            if (l.size()==3) {
                list.add(l);
            }
        }
        return list;
    }
    private static int twosum(int[] nums, int i) {
        int t=0-nums[i];
        int si=0;
        int ei=nums.length-1;
        while (si<ei) {
            if (si==i) {
                si++;
            }
            if (ei==i) {
                ei--;
            }
            if (nums[si]+nums[ei]==t) {
                return si;
            }
            if (nums[si]+nums[ei]>t) {
                ei--;
            } else {
                si++;
            }
        }
        return i;
    }
}
