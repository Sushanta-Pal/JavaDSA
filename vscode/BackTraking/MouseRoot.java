package vscode.BackTraking;

import java.util.Arrays;

public class MouseRoot {
    public static void main(String[] args) {
    //   System.out.println(findRoot(0,0,2,2));
    //   printRootDigonal(0, 0, 2, 2, "");
        boolean board[][]= new boolean[3][3];
        int arr[][]=new int[board.length][board[0].length];
        //printAllRoot(0, 0, 2, 2, "", board);
        printAllRootImg(0,0,2,2,"",board,arr,1);
    }
    private static void printAllRoot(int sr, int sc, int R, int C,String s,boolean[][] board) {
        if (sr==R && sc ==C) {
         System.out.println(s);
         return;
        }
        //Base condition 
        if (board[sr][sc]==true) {
            return;
        }
        board[sr][sc]=true;
        //For Down
         if (sr<R) {
             printAllRoot(sr+1, sc, R, C,s+"D",board);
         }
         //for Right
         if (sc<C) {
               printAllRoot(sr, sc+1, R, C,s+"R",board);
         }
         //for up
         if (sr>0) {
            printAllRoot(sr-1, sc, R, C,s+"U",board);
         }
         // for left 
         if (sc>0) {
            printAllRoot(sr, sc-1, R, C,s+"L",board);
         }

      board[sr][sc]=false;
        
     }
      private static void printAllRootImg(int sr, int sc, int R, int C,String s,boolean[][] board,int arr[][],int step) {
        
        if (sr==R && sc ==C) {
            arr[sr][sc]=step;
            for(int a[]:arr){
                System.out.println(Arrays.toString(a));
            }
         System.out.println(s);
         return;
        }
        //Base condition 
        if (board[sr][sc]==true) {
            return;
        }
        arr[sr][sc]=step;
        board[sr][sc]=true;
        //For Down
         if (sr<R) {
             printAllRootImg(sr+1, sc, R, C,s+"D",board,arr,step+1);
         }
         //for Right
         if (sc<C) {
               printAllRootImg(sr, sc+1, R, C,s+"R",board,arr,step+1);
         }
         //for up
         if (sr>0) {
            printAllRootImg(sr-1, sc, R, C,s+"U",board,arr,step+1);
         }
         // for left 
         if (sc>0) {
            printAllRootImg(sr, sc-1, R, C,s+"L",board,arr,step+1);
         }

      board[sr][sc]=false;
      arr[sr][sc]=0;
        
     }

    private static int findRoot(int sr, int sc, int R, int C) {
        if (sr == R || sc == C) {
            return 1;
        }
        int ans =0;
        ans =ans+findRoot(sr+1, sc, R, C);
        ans =ans +findRoot(sr, sc+1, R, C);
        return ans;
    }
    private static void printRoot(int sr, int sc, int R, int C,String s) {
       if (sr==R && sc ==C) {
        System.out.println(s);
        return;
       }
        if (sr<=R) {
            printRoot(sr+1, sc, R, C,s+"D");
        }
        if (sc<=C) {
              printRoot(sr, sc+1, R, C,s+"R");
        }
     
       
    }
     private static void printRootDigonal(int sr, int sc, int R, int C,String s) {
       if (sr==R && sc ==C) {
        System.out.println(s);
        return;
       }
       if (sr<=R && sc <=C) {
            printRoot(sr+1, sc+1, R, C,s+"d");
        }
        if (sr<=R) {
            printRoot(sr+1, sc, R, C,s+"D");
        }
        if (sc<=C) {
              printRoot(sr, sc+1, R, C,s+"R");
        }
        
     
       
    }

}
