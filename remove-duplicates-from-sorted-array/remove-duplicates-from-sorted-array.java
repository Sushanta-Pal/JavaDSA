class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int k=0;
        int prv=nums[0];
        k++;
        for(int curr=1;curr<nums.length;curr++){
            if(nums[curr]!=prv) {
                k++;
                prv=nums[curr];
            }
            else{
                nums[curr]=Integer.MAX_VALUE;
            }
           
        }
        Arrays.sort(nums);
        return k;
    }
}