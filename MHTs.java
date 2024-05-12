import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MHTs {
    public static void main(String[] args) {
        int n=4;
        int[][] edges={{1,0},{1,2},{1,3}};
 System.out.println(findMinHeightTrees(n, edges));
    }
//     public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
//         List<Integer> ans= new ArrayList<>();
//         HashMap<Integer, List<Integer>> map= new HashMap<>();
//         // mapping the point
//         for(int i=0;i<n;i++){
//             List<Integer> mp= new ArrayList<>();
//             for(int j=0;j<edges.length;j++){
//                 if (edges[j][0]==i) {
//                     mp.add(edges[j][1]);
//                 }
//                 if (edges[j][1]==i) {
//                     mp.add(edges[j][0]);
//                 }
//             }
//             map.put(i, mp);
//         }
        
//         for(int i=0;i<n;i++) getHeight(ans,map, i);

//         return ans;
        
//     }
//    static int min=Integer.MAX_VALUE;
//     private static void getHeight(List<Integer> ans, HashMap<Integer, List<Integer>> map,int idx) {
//             int level=0;
//         Set<Integer> vis= new HashSet<>();
//         Queue<Integer> q=new LinkedList<>();
//         q.add(idx);
//         while (!q.isEmpty()) {
//            int size= q.size();
//            for(int i=0;i<size;i++){
//             int curr=q.remove();
//             List<Integer> mp= map.get(curr);  //All the neighbour node of the current node
//             for(int j=0;j<mp.size();j++){
//                 if (!vis.contains(mp.get(j))) {
//                     q.add(mp.get(j));
//                 }
//             }
//             vis.add(curr);
//            }
//             level++;
//         }
//         if (level < min) {
//             min = level;
//             ans.clear();
//             ans.add(idx);
//         } else if (level == min) {
//             ans.add(idx);
//         }
//         }

        public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map= new HashMap<>();
            // mapping the point
            for(int i=0;i<n;i++){
                List<Integer> mp= new ArrayList<>();
                for(int j=0;j<edges.length;j++){
                    if (edges[j][0]==i) {
                        mp.add(edges[j][1]);
                    }
                    if (edges[j][1]==i) {
                        mp.add(edges[j][0]);
                    }
                }
                map.put(i, mp);
            }

            ///finding the degree of each node
            int[] deg=new int[n];
            for(int i=0;i<n;i++){
                    deg[i]=map.get(i).size();
            }

            Queue<Integer> q= new LinkedList<>();
            //adding the node with degree 1
            for(int i=0;i<deg.length;i++) if(deg[i]==1) q.offer(i);

            //BFS

           int remainingNodes=n;
           while (remainingNodes>2) {
            int size=q.size();
             remainingNodes-=size;
             for(int i=0;i<size;i++){
                int leaf=q.remove();
                    for(int adj:map.get(leaf)){
                            deg[adj]--;
                            if(deg[adj]==1) q.offer(adj);
                    }
                map.remove(leaf);
             }

           }
           return new ArrayList<>(q);

        }
}
