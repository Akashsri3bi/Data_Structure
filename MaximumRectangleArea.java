import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumRectangleArea {

          static int findArea(int[] arr){
        Deque<Pair<Integer, Integer>> st = new ArrayDeque<>();

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            int idx = i;

            while(st.size() > 0 && st.peek().getKey() >= arr[i]){
                Pair<Integer, Integer> p = st.pop();

                idx = p.getValue();

                int area = p.getKey()*(i - idx);

                max = Math.max(max, area);
            }

            st.push(new Pair<>(arr[i], idx));
        }

        while(st.size() > 0){
            Pair<Integer, Integer> p = st.pop();
            int area = p.getKey()*(arr.length - p.getValue());
            max = Math.max(max, area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int[] height = new int[matrix[0].length];
        int maxi = 0 ; 
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else{
                    height[j] = 0;
                }
            }
            maxi = Math.max(maxi , findArea(height)) ; 
        }
        return maxi;
    }
      
}
