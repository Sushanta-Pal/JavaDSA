import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SumOfDis {
   public static void main(String[] args) {
    int n=6;
    int[][] edges={{0,1},{0,2},{2,3},{2,4},{2,5}};
    SumOfDis s = new SumOfDis();
    System.out.println(Arrays.toString(s.sumOfDistancesInTree(n, edges)));
   } 
//    public int[] sumOfDistancesInTree(int n, int[][] edges) {
//         HashMap<Integer,List<Integer>> map = new HashMap<>();
//         //map all the adjecent element
//         for(int i=0;i<n;i++){
//             List<Integer> list= new ArrayList<>();
//             for(int j=0;j<edges.length;j++){
//                     if (edges[j][0]==i) {
//                         list.add(edges[j][1]);
//                     }else if (edges[j][1]==i) {
//                         list.add(edges[j][0]);
//                     }
//             }
//             map.put(i,list);
//         }

//         int [] ans = new int[n];
//         for(int i=0;i<n;i++){
//             ans[i]=help(map,i,n);
//         }
//         return ans;
//    }
private int help(HashMap<Integer, List<Integer>> map,int i,int n) {
    int dis=1;
    int ans=0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        visited[i]=true;
 
       for(int x:map.get(i)){
        q.add(x);
        visited[x]=true;
       }
            while (!q.isEmpty()) {
                ans+=dis*q.size();
                int s=q.size();
                dis++;
                for(int j=0;j<s;j++){
                        List<Integer> li = map.get(q.poll());
                        for(int x:li){
                            if(!visited[x]){
                                q.add(x);
                                visited[x]=true;
                            }
                        }
                }
            }

    return ans;
    }


public int[] sumOfDistancesInTree(int n, int[][] edges) {
        int[] deg=new int[n];
        for(int i=0;i<edges.length;i++){
            deg[edges[i][0]]++;
            deg[edges[i][1]]++;
        }
        HashMap<Integer,List<Integer>> map = new HashMap<>();
                //map all the adjecent element
                for(int i=0;i<n;i++){
                    List<Integer> list= new ArrayList<>();
                    for(int j=0;j<edges.length;j++){
                            if (edges[j][0]==i) {
                                list.add(edges[j][1]);
                            }else if (edges[j][1]==i) {
                                list.add(edges[j][0]);
                            }
                    }
                    map.put(i,list);
                }

                int [] ans = new int[n];
                ans[0]=help(map, 0, n);
                boolean[] v=new boolean[deg.length];
                v[0]=true;
                dfs(map,deg,0,ans,v);
                return ans;


}

private void dfs(HashMap<Integer, List<Integer>> map, int[] deg,int root, int[] ans, boolean[] v) {
    Queue<Integer> q = new LinkedList<>();
    for(int x:map.get(root)){
        if (!v[x]) {
          q.add(x)  ;
        }
        

       }

   
   while (!q.isEmpty()) {
   int s = q.size();
    for(int j=0;j<s;j++){
        int curr=q.poll();
        v[curr]=true;
        ans[curr]=ans[root]+deg.length-deg[curr]-deg[curr];
                dfs(map, deg, curr, ans,v);
            }

    
    }
}
}




