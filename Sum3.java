import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] arg) {
        int[] nums = {-43,57,-71,47,3,30,-85,6,60,-59,0,-46,-40,-73,53,68,-82,-54,88,73,20,-89,-22,39,55,-26,95,-87,-57,-86,28,-37,43,-27,-24,-88,-35,82,-3,39,-85,-46,37,45,-24,35,-49,-27,-96,89,87,-62,85,-44,64,78,14,59,-55,-10,0,98,50,-75,11,97,-72,85,-68,-76,44,-12,76,76,8,-75,-64,-57,29,-24,27,-3,-45,-87,48,10,-13,17,94,-85,11,-42,-98,89,97,-66,66,88,-89,90,-68,-62,-21,2,37,-15,-13,-24,-23,3,-58,-9,-71,0,37,-28,22,52,-34,24,-8,-20,29,-98,55,4,36,-3,-9,98,-26,17,82,23,56,54,53,51,-50,0,-15,-50,84,-90,90,72,-46,-96,-56,-76,-32,-8,-69,-32,-41,-56,69,-40,-25,-44,49,-62,36,-55,41,36,-60,90,37,13,87,66,-40,40,-35,-11,31,-45,-62,92,96,8,-4,-50,87,-17,-64,95,-89,68,-51,-40,-85,15,50,-15,0,-67,-55,45,11,-80,-45,-10,-8,90,-23,-41,80,19,29,7};
        System.out.println(threeSumClosest(nums, 255));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int k = nums.length - 1;
        while (j != k) {
            if (i > 0 && nums[i] == nums[i - 1]) {

            } else {
                while (j < k) {
                    if (nums[j] == nums[j - 1] && j - 1 != i) {
                        j++;
                    } else if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        result.add(ans);
                        while (j<k && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        while (j<k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;
                        k --;

                    } else if (nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    } else
                        k--;
                }
            }
            i++;
            j = i + 1;
            k = nums.length - 1;
        }
        return result;
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array must contain at least three elements.");
        }

        Arrays.sort(nums); // Sort the array for two-pointer approach
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];
                
                // If current sum is exactly equal to target, return it immediately
                if (currentSum == target) {
                    return currentSum;
                }
                
                // Update closest sum if current sum is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                
                if (currentSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return closestSum;
}
}
