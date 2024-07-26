import java.util.Arrays;
import java.util.HashMap;

public class L2418 {
    public static void main(String[] args) {
        String[] names={"Alice","Bob","Bob"};
        int[] heights={155,185,150};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            mp.put(heights[i],i);
        }
        Arrays.sort(heights);
        String[] res=new String[names.length];
        for(int i=0;i<names.length;i++){
                int idx=mp.get(heights[names.length-1-i]);
                res[i]=names[idx];
        }
        return res;
    }
}
