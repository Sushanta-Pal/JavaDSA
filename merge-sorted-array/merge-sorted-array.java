class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums=new int[m];
        for(int i=0;i<m;i++)
        nums[i]=nums1[i];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums[i]<nums2[j]){
                nums1[k++]=nums[i++];
            }else{
               nums1[k++]=nums2[j++]; 
            }
        }

        while(i<m ){
                nums1[k++]=nums[i++];
        }
         while(j<n ){
                nums1[k++]=nums2[j++];
        }
    }
}