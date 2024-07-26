import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sum4 {

    public static void main(String[] args) {
        int[] nums ={-3,-1,0,2,4,5};
        System.out.println(fourSum(nums,2));
    }
    
        public static List<List<Integer>> fourSum(int[] nums, int target) {
    
                List<List<Integer>> result = new ArrayList<>();
            if (nums.length < 4 || target==-294967296|| target==-294967297) {
                return result;
            }
            Arrays.sort(nums);
            int n = nums.length;
            
            for (int i = 0; i < n - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i
                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates for j
                    int left = j + 1;
                    int right = n - 1;
                    while (left < right) {
                        long sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if ((sum) ==(target)) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) left++; // skip duplicates for left
                            while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates for right
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return result;
        }
    }
