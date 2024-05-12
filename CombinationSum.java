import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int target =8;
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer>list =new ArrayList<>();
        combinationSum(arr,target,"");
        ans=  combinationSumReturn(arr,target,list);
        System.out.println(ans);

    }
     public static List<List<Integer>> combinationSumReturn(int[] arr, int target,List<Integer>list) {
                    if (target<=0) {
                     List<List<Integer>> tem =new ArrayList<>();
                     tem.add(list);
                     return tem;
        }
        List<List<Integer>> ans =new ArrayList<>();
            for(int i=0;i<arr.length;i++){
            if (arr[i]<=target) {
                list.add(arr[i]);
               ans.addAll(combinationSumReturn(Arrays.copyOfRange(arr,i,arr.length),target-arr[i],list));
            }
        }
      return ans;
      }

    private static void combinationSum(int[] arr, int target,String p) {
        if (target<=0) {
            System.out.println(p);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]<=target) {
                combinationSum(Arrays.copyOfRange(arr,i,arr.length),target-arr[i],p+arr[i]);
            }
        }
    }
        
   
}
