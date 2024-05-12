import java.util.ArrayList;
import java.util.List;

public class missingpositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    /*public static int firstMissingPositive(int[] nums) {
        boolean[] fre=new boolean[Integer.MAX_VALUE];
        for(int i:nums){
            if (i<0) {
                continue;
            }
            fre[i]=true;
        }
        for(int i=1;i<fre.length;i++){
            if (fre[i]==false) {
                return i;
            }
        }
        return fre.length;

    }
    public static int firstMissingPositive(int[] nums) {
        int min=1;
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if (i<0) {
                continue;
            }
            list.add(i);
            if (list.contains(min)) {
                min++;
            }
        }
        
       

    }*/
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int idx=nums[i]-1;
            if (nums[i]>0 && nums[i]<nums.length &&nums[i]!=idx) {
                int tem=nums[i];
                nums[i]=nums[idx];
                nums[idx]=tem;
            }
            else i++;
        }
        for(int j=0;i<nums.length;j++){
            if (nums[j]!=j) {
                return j+1;
            }
        }
        return nums.length+1;
    }
}
