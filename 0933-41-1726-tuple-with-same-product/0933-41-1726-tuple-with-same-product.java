class Solution {

    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> fr = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                fr.put(product, fr.getOrDefault(product, 0) + 1);
            }
        }
        
        int res = 0;
        for (int count : fr.values()) {
            if (count > 1) {
                res += ((count * (count - 1)) / 2) * 8;  // nc2 * 8
            }
        }
        return res;
    }
}