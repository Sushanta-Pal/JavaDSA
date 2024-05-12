public class lh {
    public static void main(String[] args) {
        int[] nums ={3,4,-1,1};
        System.out.println(mispossitive(nums));
    }

    private static int mispossitive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int idx=nums[i]-1;
            if (nums[i]>0 && nums[i]<=nums.length &&nums[i]!=idx) {
                int tem=nums[idx];
               nums[idx]=nums[i];
                nums[i]=tem;
            }
            else{
                i++;}
        }
        for(int j=0;j<nums.length;j++){
            if (nums[j]!=j+1) {
                return j+1;
            }

        }
        return nums.length+1;
    }

}
