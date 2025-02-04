class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans= nums[0];
        if(nums.length==1) return ans;
        for(int i=0;i<nums.length;){
            int j=i+1;
            int curr=nums[i];
            while( j< nums.length && nums[j]>nums[j-1]){
                curr+=nums[j++];
            }
            ans=Math.max(ans,curr);
            i=j;
        }
        return ans;
        
    }
}