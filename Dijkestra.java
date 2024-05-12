import java.util.Arrays;

/**
 * Dijkestra
 */
public class Dijkestra {

    public static void main(String[] args) {
        int[][] graph = {{0,4,5},{4,0,8},{5,8,0}};
        int src=(int) (Math.random()*10)%3;
    
        int[] dis=shortDis(graph,src);
        System.out.println(Arrays.toString(dis));
    }

    private static int[] shortDis(int[][] graph, int src) {
        int n=graph.length;
        int[] dis=new int[n];
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            dis[i]=Integer.MAX_VALUE;
            visited[i]=false;
        }
        dis[src]=0;
        for(int i=0;i<n-1;i++){
            int u=minDis(dis,visited);
            visited[u]=true;

            //Adjecent Vertex 
            for(int v=0;v<n;v++){
                if(!visited[v] && graph[u][v]!=0&& dis[u]!=Integer.MAX_VALUE && dis[v]>dis[u]+graph[u][v]){
                    dis[v]=dis[u]+graph[u][v];
                }
            }
        }
            return dis;
 
       }

    private static int minDis(int[] dis, boolean[] visited) {
        int min=Integer.MAX_VALUE;
        int min_index=-1;
        for(int i=0;i<dis.length;i++){
            if(visited[i]==false && dis[i]<=min){
                min=dis[i]; 
                min_index=i;
            }
        }
        return min_index;
        }

}