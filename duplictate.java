import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplictate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        boolean arr[]=new boolean[nums.length];
   
        for(int i:nums){
                if (arr[i]) {
                    return i;
                }
                arr[i]=true;
        }
        return -1;
    }
    public static int[][] constructProductMatrix(int[][] grid) {
        int[][] p=new int[grid.length][grid[0].length];
        int m=1;
        for(int i=0;i<grid.length;i++)
        for(int j:grid[i])
        m*=j;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++)
       p[i][j]=(m/grid[i][j])%12345;
        return p;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        for(int i:nums){
            if (arr[i]==true) {
                ans.add(i);
                continue;
            }
            arr[i]=true;
        }
        return ans;
    }

    
}
