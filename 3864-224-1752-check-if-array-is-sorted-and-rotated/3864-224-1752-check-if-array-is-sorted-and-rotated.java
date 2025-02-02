class Solution {
    public boolean check(int[] nums) {
        int[] rotated = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[i] = nums[i];
            rotated[i + nums.length] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            int ans = i + 1;
            while (ans < i + nums.length && rotated[ans] >= rotated[ans - 1]) ans++;
            if (ans == i + nums.length) return true;
        }
        
        return false;
    }
}