import java.util.HashSet;

/**
 * Unique Array
 */
public class UniqueArray {

    public static void main(String[] args) {
        int[] nums={3,2,1,2,1,7};
        UniqueArray ob= new UniqueArray();
        System.out.println(ob.minIncrementForUnique(nums));
    }
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int res = 0;
        for (int num : nums) {
            int curr=num;
           while (set.contains(curr)) {
            curr+=1;
            res++;
           }
           set.add(curr);
        }
        return res;
    }
    
}