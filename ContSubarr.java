import java.util.LinkedList;
import java.util.Queue;

public class ContSubarr {
    public static void main(String[] args) {
        int[] arr={23,2,4,6,7};
        System.out.println(new ContSubarr().checkSubarraySum(arr, 6));
    }
    public boolean checkSubarraySum(int[] nums, int k) {
        Queue<Integer> q =new LinkedList<>();
        for(int i=1;i<nums.length;i++){
            int size=q.size();
            
                for(int j=0;j<size;j++){
                        int curr=q.poll();
                        if((curr+nums[i])%k==0){
                            return true;
                        }
                        q.add(curr+nums[i]);
                }
            
            if (nums[i]+nums[i-1]%k==0) {
                return true;
            }
            q.add(nums[i]+nums[i-1]);
        }
        
        return false;
    }
}
