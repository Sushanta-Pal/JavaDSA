class Solution {
    // private void swap(int[] arr,int i,int j){
    //     int tem=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=arr[i];
    // }
    public int[] applyOperations(int[] nums) {
        //two pointer approach
//         int i=0;
//         int j=nums.length-1;
//         while(nums[j]==0) j--;
//         while(i<j){
//             if(nums[i]==0){
//                 swap(nums,i,j);
//                 j--;
//             }
//             if(nums[i]==nums[i+1]){
//                 nums[i]*=2;
//                 nums[i+1]=0;
               
//             }
//              i++;
//         }
//         return nums;
        int[] res=new int[nums.length];
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    nums[i]=0;
                    nums[i-1]*=2;
                }
            }
        int it=0;
        for(int curr:nums){
            if(curr!=0){
                res[it++]=curr;
            }
        }
        return res;
        
        
    }
}