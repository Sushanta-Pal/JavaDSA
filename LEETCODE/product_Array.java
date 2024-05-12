package LEETCODE;

/**
 * product_Array
 */
public class product_Array {
 public static void main(String[] args) {
    
 }
    public static int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int total=1;
        int zeros=0;
        for(int val:nums){
            if (val==0) {
                zeros++;
                continue;
            }
            total*=val;
        }if (zeros==0) {
            for(int i=0;i<nums.length;i++){
                ans[i]=(total/nums[i]);
            }
        }else
        {
            for(int i=0;i<nums.length;i++){
             if( nums[i]==0)
             ans[i]=total;
             else ans[i]=0;
            } 
        }
        
        return nums;
    }
}