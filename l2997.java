public class l2997 {
    public static void main(String[] args) {
        int[] nums={2,0,2,0};
        int k=0;
       l2997 ob= new l2997();
       System.out.println(ob.minOperations(nums, k));
    }
    public int minOperations(int[] nums, int k) {
        int t=0;
        for(int i:nums) t=t^i;
        int ans=0;
        int l=(int) (Math.log(t)/Math.log(2));
        for(int i=0;i<l+1;i++){
            if ((t&(1<<i)) !=  (k &(1<<i))) {
                ans ++;
            }
        }
        return ans;
        
    }
}
