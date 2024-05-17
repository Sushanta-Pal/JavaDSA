public class MaxGold {
    public static void main(String[] args) {
        int[][] grid = { { 0,6,0 }, { 5,8,7 }, { 0,9,0 } };
        System.out.println(new MaxGold().getMaximumGold(grid));
    }

    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int[][] dp = new int[grid.length][grid[0].length]; // Use proper size for dp array
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    int currentGold = dfs(grid, i, j, dp, visited);
                    maxGold = Math.max(maxGold, currentGold);
                }
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int i, int j, int[][] dp, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        visited[i][j] = true;

        int left = dfs(grid, i, j - 1, dp, visited);
        int right = dfs(grid, i, j + 1, dp, visited);
        int up = dfs(grid, i - 1, j, dp, visited);
        int down = dfs(grid, i + 1, j, dp, visited);

        visited[i][j] = false; // Reset visited flag after completing recursion

        dp[i][j] = Math.max(left, Math.max(right, Math.max(up, down))) + grid[i][j];

        return dp[i][j];
    }
}
