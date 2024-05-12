import java.util.ArrayList;

public class findonlyOne {
    public static void main(String[] args) {
        int arr[] ={2,3,4,3,2,5,6,4,6};
        int arr2[] ={2,3,3,4,3,2,5,6,4,6,4,6,2};
        System.out.println(checkOnlyOne(arr));
        //System.out.println(checkOnlyOnebw3(arr2));
    }

   
    private static int checkOnlyOne(int[] arr) {
        int ans =0;
        for(var i: arr){
            ans^=i;
        }
        return ans;
    }

}
