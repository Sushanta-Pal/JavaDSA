import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] arg){
           int[] nums = {-1,0,1,2,-1,-4};
           System.out.println(threeSum(nums));
    } 
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3) return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            List<List<Integer>> re=twoSum(Arrays.copyOfRange(nums,i,nums.length));
            for(List<Integer> list:re){
                list.add(nums[i]);
                result.add(list);
            }
    }
    return result;
}
    public static List<List<Integer>> twoSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        
        int terget=nums[0];
            int i=1;
            int j=nums.length-1;
            while(i<j){
                
                    if(nums[i]==nums[i-1]){
                        i++;
                        continue;
                    }
                    if(j!=nums.length-1 &&nums[j]==nums[j+1]){
                        j--;
                        continue;
                    }
                        List<Integer> ans=new ArrayList<>();
                int sum=nums[i]+nums[j];
                if(sum+terget==0){
                    ans.add(nums[i++]);
                    ans.add(nums[j--]);
                    result.add(ans);
                }
                if(sum+terget>0){
                    j--;
                }else{
                    i++;
                }

            }
        return result;
        
    }
}
