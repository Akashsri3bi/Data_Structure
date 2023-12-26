import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntiDiagonal {

      public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int[] ans = new int[matrix.length*matrix.length] ; 
        int m = matrix.length ; 
        
        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int key = i + j;
                List<Integer> values = mp.getOrDefault(key, new ArrayList<>());
                values.add(matrix[i][j]);
                mp.put(key, values);
            }
        }

        List<Integer> a = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
            a.addAll(entry.getValue());
        }

        for(int i = 0 ;i<m*m;i++){
            ans[i] = a.get(i) ; 
        }
        return ans ;
    }
      
}
