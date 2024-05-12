import java.util.ArrayList;

public class Ls {
    public static void main(String[] args) {
        int arr[]={2,3,8,5,6,5,7};
        int terget =5;
        // System.out.println(LinearSearch(arr,terget,0));
        // System.out.println(findIdx(arr, terget, 0));
        // System.out.println(findLastIdx(arr, terget, arr.length-1));
       // System.out.println(findAllOccurances(arr,terget,0,new ArrayList<Integer>()));
        System.out.println(findAllOccurances(arr,terget,0));
    }
  //#KK return List by taking Argument 
    private static ArrayList<Integer> findAllOccurances(int[] arr, int terget, int idx, ArrayList<Integer> list) {
        if (idx == arr.length) {
            return list;
        }
        if (arr[idx]==terget) {
            list.add(idx);
        }
       return findAllOccurances(arr, terget, idx+1,list);
    }
  //#KK return List by Not taking Argument,but creating an ArrayList in every recursive Call.
    private static ArrayList<Integer> findAllOccurances(int[] arr, int terget, int idx) {
        ArrayList<Integer> list = new ArrayList<>();
        if (idx == arr.length) {
            return list;
        }
        if (arr[idx]==terget) {
            list.add(idx);
        }
      list.addAll( findAllOccurances(arr, terget, idx+1));
      return list;
    }

    private static int  findLastIdx(int[] arr, int terget, int idx) {
        if (idx ==-1) {
            return -1;
        }
        if (arr[idx]==terget) {
             return idx;
        }
       return findIdx(arr, terget, idx-1);
    }

    private static boolean LinearSearch(int[] arr, int terget, int idx) {
        if (idx == arr.length) {
            return false;
        }
        return arr[idx] == terget || LinearSearch(arr, terget, idx+1);
    }
    private static  int  findIdx(int[] arr, int terget, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx]==terget) {
             return idx;
        }
       return findIdx(arr, terget, idx+1);
        
    }
}
