package BinarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2d {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] points = {
                {3,1},
                {9,0},
                {1,0},
                {1,4},
                {5,3},
                {8,8}
        };
 System.out.println(maxWidthOfVerticalArea(points));
        
       
    }
    public  static int maxWidthOfVerticalArea(int[][] points) {
        // Sorting based on the values in the 0th row
         Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int m=0;
        for (int i=0;i<points.length-1;i++) {
            if ((points[i+1][0]-points[i][0])>m) {
                m =Math.max(m,points[i+1][0]-points[i][0]);
            }
        }
       return m;
    }
}
