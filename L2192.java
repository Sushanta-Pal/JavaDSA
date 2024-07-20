import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class L2192 {
   public static void main(String[] args) {
    int[][] edges={{0,3},{5,0},{2,3},{4,3},{5,3},{1,3},{2,5},{0,1},{4,5},{4,2},{4,0},{2,1},{5,1}};
    System.out.println(getAncestors(6, edges));
   } 
   public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(n);
        for(int i = 0; i < n; i++){
            ans.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            
        List<Integer> curr= ans.get(edges[i][0]);
        for(int curr_val :curr){
            if(!ans.get(edges[i][1]).contains(curr_val))
                ans.get(edges[i][1]).add(curr_val);
        }
        if(!ans.get(edges[i][1]).contains(edges[i][0]))
                ans.get(edges[i][1]).add(edges[i][0]);

        }
        List<Integer> list= ans.get(0);
        for(Integer v :list){
            List<Integer> l =ans.get(v);
            for(int j :l){
                if (!ans.get(0).contains(j)) {
                    ans.get(0).add(j);
                }
            }
        }
        for(int i = 0; i < n; i++){
           
            Collections.sort(ans.get(i));
        }
        return ans;
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(i, new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){

          if(mp.get(edges[i][1]).contains(edges[i][0]))
            mp.get(edges[i][1]).add(edges[i][0]);
        
            mp.get(edges[i][1]).addAll(mp.get(edges[0][1]));

            mp.containsValue(edges[i][1]);
        
        }

    }
}
