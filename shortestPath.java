import java.util.Arrays;

public class shortestPath {
    
    public static void main(String[] args) {
        int INF=999;
        int[][] graph={  { 0, 4, INF, 5,INF },
                         { INF, 0, 1, INF ,6},
                         { 2, INF, 0, 3,INF },
                         { INF, INF, 1, 0 ,2},
                        {1,INF,INF,4,0}};
                        
                         for (int[] row : graph) {
                            System.out.println(Arrays.toString(row));
                        }
                        System.out.println();
                        graph=floydwarshall(graph, 0);
                        for (int[] row : graph) {
                            System.out.println(Arrays.toString(row));
                        }

    }
    public static int[][] floydwarshall(int graph[][],int d){
        if (d==graph.length) {
            return graph;
        }
       for(int i=0;i<graph.length;i++){
        for(int j=0;j<graph.length;j++){
            //chack and update shortest path here..
            if (graph[i][j]>(graph[i][d]+graph[d][j])) {
                graph[i][j]=(graph[i][d]+graph[d][j]);
            }
        }
       }

        return floydwarshall(graph, d+1);
    }
}
