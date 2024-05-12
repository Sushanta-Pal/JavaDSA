public class MinimumFallingpath {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        MinimumFallingpath ob= new MinimumFallingpath();
        System.out.println(ob.minFallingPathSum(grid));
    }
    public int minFallingPathSum(int[][] grid) {
        if (grid.length==1) {
            return min(grid[0], -1);
        }
        for(int i=grid.length-2;i>=0;i--){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=grid[i][j]+min(grid[i+1], j);
            }
        }
        return min(grid[0], -1);
    }
    public int min(int arr[],int i){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                  if (min>arr[j]) {
                    min=arr[j];
                  }
                }
            }
            return min;
    
    }
}
