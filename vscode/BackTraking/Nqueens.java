package vscode.BackTraking;
public class Nqueens {
    public static void main(String[] args) {
        int row = 4;
        boolean board [][]=new boolean[row][row];
       System.out.println( nQueen(board,0));
    }

    private static int nQueen(boolean[][] board, int row) {
        if (row ==board.length) {
            display(board);
            return 1;
        }
        int count =0;
        for(int col=0;col<board.length;col++){
            if (isSafe(board,row,col)) {
                board[row][col] =true;
                count+=nQueen(board, row+1);
                board[row][col] =false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //if above is a Queen 
        for(int i= row;i>=0;i--){
            if (board[i][col]) {
                return false;
            }
        }
        //left diagonal
        for(int i=row,j=col;i>0&&j>0;i--,j--){
            if (board[i-1][j-1]) {
                return false;
            }
        }
         //right  diagonal
        for(int i=row,j=col;i>0&&j<board.length-1;i--,j++){
            if (board[i-1][j+1]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean row[]: board){
            for(boolean elm : row){
                if (elm) {
                    System.out.print("Q ");
                }
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
