import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class L2751 {
    public static void main(String[] args) {
        int[] positions = {5,4,3,2,1};
        int[] healths = {2,17,9,15,10};
        String directions = "RRRRR";
        
        L2751 l2751 = new L2751();
        List<Integer> survivedHealths = l2751.survivedRobotsHealths(positions, healths, directions);
        
        System.out.println(survivedHealths);
    }

    public  List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int i=0;i<positions.length;i++){
                    map.put(positions[i],i);
                }
                Arrays.sort(positions);
             Stack<Integer> st =new Stack<>();
             for(int i=0;i<positions.length;i++){
                int idx=map.get(positions[i]);
                if (st.isEmpty() && directions.charAt(idx)=='L') {
                    System.err.println("do what i say");
                }else if(st.isEmpty()){
                   st.push(positions[i]);
                }else if (directions.charAt(idx)=='R') {
                    st.push(positions[i]);
                }
                else
                    helper(st,map,idx,positions,directions,healths);
             }
             List<Integer> ans = new ArrayList<>();
             for(int i=0;i<positions.length;i++){
                    int hi=map.get(positions[i]);
                    if (healths[hi]!=0) {
                        ans.add(healths[hi]);
                    }
             }
             return ans;
    }

    private void helper(Stack<Integer> st, HashMap<Integer, Integer> map, int idx, int[] positions, String directions, int[] healths) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        int topIdx=map.get(top);
        if (healths[topIdx]>healths[idx]) {
            healths[idx]=0;
            healths[topIdx]--;
            st.push(top);
        }else if (healths[topIdx]==healths[idx]) {
            healths[idx]=0;
            healths[topIdx]=0;
           
        }else{
            healths[topIdx]=0;
            healths[idx]--;
            helper(st, map, idx, positions, directions, healths);
        }


        }
}
