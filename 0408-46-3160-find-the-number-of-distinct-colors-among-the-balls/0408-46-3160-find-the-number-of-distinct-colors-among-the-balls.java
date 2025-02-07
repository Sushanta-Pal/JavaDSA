import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, List<Integer>> colorCount = new HashMap<>();
        HashMap<Integer, Integer> indexToColor = new HashMap<>();
        int[] res = new int[queries.length];
        int i = 0;
        
        for (int[] curr : queries) {
            int index = curr[0];
            int color = curr[1];
            
            if (indexToColor.containsKey(index)) {
                int prevColor = indexToColor.get(index);
                colorCount.get(prevColor).remove((Integer) index);
                if (colorCount.get(prevColor).isEmpty()) {
                    colorCount.remove(prevColor);
                }
            }
            
            colorCount.putIfAbsent(color, new ArrayList<>());
            colorCount.get(color).add(index);
            indexToColor.put(index, color);
            
            res[i++] = colorCount.size();
        }
        
        return res;
    }
}
