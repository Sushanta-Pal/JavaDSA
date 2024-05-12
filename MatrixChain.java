import java.util.Arrays;


public class MatrixChain {
    
    public static void main(String[] args) {
       int[] matrix={ 1,2,3 };
        int [][] dp=new int[100][100];
       for(int[] r:dp){
           Arrays.fill(r, -1);
       }
       
        MatrixChain ob= new MatrixChain();
        System.out.println(ob.matrixChainOrder(matrix,dp,1,matrix.length-1));
    }
  
   public int matrixChainOrder(int[] matrix, int[][] dp, int si, int ei) {
        if (si==ei) {
            return 0;
        }
        if (dp[si][ei]!=-1) {
            return dp[si][ei];
        }
dp[si][ei]=Integer.MAX_VALUE;
for(int i=si;i<ei;i++){
dp[si][ei]=Math.min(dp[si][ei],matrixChainOrder(matrix,dp,si, i)+matrixChainOrder(matrix,dp,i+1, ei)+matrix[si-1]*matrix[i]*matrix[ei]);

}
        return dp[si][ei];
        }
   
}
