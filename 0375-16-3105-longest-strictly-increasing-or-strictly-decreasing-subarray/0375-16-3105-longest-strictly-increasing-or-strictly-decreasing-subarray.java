class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;){
            int j=i+1;
            int curr=1;
            while(j<nums.length && nums[j]>nums[j-1]){
                j++;
                curr++;  //incrising 
        }
            ans=ans<curr?curr:ans;
            i=j;
        }
         for(int i=0;i<nums.length;){
            int j=i+1;
            int curr=1;
            while(j<nums.length && nums[j]<nums[j-1]){
                curr++;  //decrising 
                j++;
                }
            ans=ans<curr?curr:ans;
            i=j;
        }
        return ans;
    }
}