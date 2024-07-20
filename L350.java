import java.util.ArrayList;
import java.util.List;

public class L350 {
    public static void main(String[] args) {
        
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] fq=new int[1001];
        for(int val:nums1){
            fq[val]++;
        }
       List<Integer> res=new ArrayList<Integer>();
       for(int val:nums2){
        if(fq[val]>0){
            res.add(val);
            fq[val]--;
            }
        }
        int[] ret=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ret[i]=res.get(i);
            }
            return ret;
    }
}
