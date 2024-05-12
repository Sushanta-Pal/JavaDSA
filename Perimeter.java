public class Perimeter {
    public static void main(String[] args) {
        //int[][] grid={{1,0}};
        //System.out.println(islandPerimeter(grid));
        char[][] grid={ {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }
    public static int islandPerimeter(int[][] grid) {
        int p=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j]==1) {
                    p+=4;  //A single box parimeter
                
                    //chack common region
                   
                        if (j+1<grid[i].length && grid[i][j+1]==1 ) {
                            p--;
                        }
                        if (j-1>=0 && grid[i][j-1]==1 ) {
                            p--;
                        }
                        if (i+1<grid.length && grid[i+1][j]==1 ) {
                            p--;
                        }
                        if (i-1>=0 && grid[i-1][j]==1 ) {
                            p--;
                    }

            }
        }
        }
        return p;
    }


    public static int numIslands(char[][] grid) {
        int n=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                    if (grid[i][j]=='1') {
                        grid[i][j]='0';
                        makeIsland(grid,i,j);
                        n++;
                    }
                 }
        }
        return n;
    }
  

    private static void makeIsland(char[][] grid,int i,int j) {
       
        //left sidee
            if (j-1>=0 &&  grid[i][j-1]=='1') {
                    grid[i][j-1]='0';
                makeIsland(grid,i,j-1);
            }
            //Right side 
            if (j+1<grid[0].length && grid[i][j+1]=='1') {
                grid[i][j+1]='0';
                makeIsland(grid,i,j+1);
            }
            //up side
            if (i-1>=0 && grid[i-1][j]=='1') {
                grid[i-1][j]='0';
                makeIsland(grid,i-1,j);
            }
            //down side
            if (i+1<grid.length && grid[i+1][j]=='1') {
                grid[i+1][j]='0';
                makeIsland(grid,i+1,j);
            }

            

        }
    }
