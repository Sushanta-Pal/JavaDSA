import java.util.Arrays;

class SingleIII{
    public static void main(String[] args) {
            int[] nums= {-1,0};
            SingleIII ob= new SingleIII();
            System.out.println(Arrays.toString(ob.singleNumber(nums)));
    }
     public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=1;i<nums.length-1;i++){
           if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]){
            if (nums[i]!=nums[i+1]) {
                a=nums[i];
            }
            else {
                a=nums[i-1];
            }
            break;
           }
          
        }
        int b=0;
       for(int i=0;i<nums.length;i++)
            b^=nums[i];
    return new int[] {a,b^a};
    }
}