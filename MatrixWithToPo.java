import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MatrixWithToPo {
    public static void main(String[] args) {
        MatrixWithToPo ob = new MatrixWithToPo();
        int[][] rowConditions = {{1, 2}, {3, 2}};
        int[][] colConditions = {{2, 1}, {3, 2}};
        int[][] ans = ob.buildMatrix(3, rowConditions, colConditions);
        System.out.println(Arrays.deepToString(ans));
    }

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        // adjacency matrix
        List<Integer>[] rows = graph(k, rowConditions);
        List<Integer>[] cols = graph(k, colConditions);

        List<Integer> rowTopo = topo(rows, k);
        List<Integer> colTopo = topo(cols, k);

        if (rowTopo == null || colTopo == null) {
            return new int[0][0];
        }

        int[] row = toArray(rowTopo, k);
        int[] col = toArray(colTopo, k);

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < k; i++) {
            mp.put(col[i], i);
        }

        // Create the Matrix
        int[][] ans = new int[k][k];
        for (int i = 0; i < k; i++) {
            ans[i][mp.get(row[i])] = row[i];
        }

        return ans;
    }

    private int[] toArray(List<Integer> topo, int k) {
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = topo.get(i);
        }
        return arr;
    }

    // Topo Logical Sort Using Bfs
    private List<Integer> topo(List<Integer>[] graph, int k) {
        List<Integer> topo = new ArrayList<>();
        int[] inDegree = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            for (int adj : graph[i]) {
                inDegree[adj]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= k; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            topo.add(curr);
            for (int adj : graph[curr]) {
                inDegree[adj]--;
                if (inDegree[adj] == 0) {
                    q.add(adj);
                }
            }
        }

        for (int i = 1; i <= k; i++) {
            if (inDegree[i] != 0) {
                return null;
            }
        }

        return topo;
    }

    // Create Graph
    public List<Integer>[] graph(int k, int[][] conditions) {
        List<Integer>[] graph = new ArrayList[k + 1];
        for (int i = 0; i < k + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] condition : conditions) {
            graph[condition[0]].add(condition[1]);
        }

        return graph;
    }
}
