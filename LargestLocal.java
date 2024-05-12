import java.util.Arrays;

public class LargestLocal {
    public static void main(String[] args) {
        int[][] grid={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(Arrays.toString(new LargestLocal().largestLocal(grid)[0]));
        System.out.println(Arrays.toString(new LargestLocal().largestLocal(grid)[1]));
        System.out.println(Arrays.toString(new LargestLocal().largestLocal(grid)[2]));
    }
    public int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=LocalLargrst(i,j,grid);
            }
        }
        return ans; 
    }
    private int LocalLargrst(int i, int j, int[][] grid) {
                int max=-1;
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                            if (max<grid[r][c]) {
                                max=grid[r][c];
                            }
                    }
                }
                return max;
          }
}
