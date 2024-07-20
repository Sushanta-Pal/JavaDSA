public class L1605 {
    public static void main(String[] args) {
        
    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] res=new int[rowSum.length][colSum.length];
        int i=0;
        int j=0;
        while(i<rowSum.length &&  j<colSum.length){
                int curr=Math.min(rowSum[i], colSum[j]);
                res[i][j]=curr;
                rowSum[i]-=curr;
                colSum[j]-=curr;
                if(rowSum[i]==0) i++;
                else if(colSum[j]==0) j++;

        }
        return res;
    }
}
