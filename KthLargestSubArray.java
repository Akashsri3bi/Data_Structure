import java.util.* ; 

public class KthLargestSubArray {

      public static int kthLargest(int N, int K, int[] Arr) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                  int sum = 0;
                  for (int j = i; j < N; j++) {
                        sum += Arr[j];
                        list.add(sum);
                  }
            }

            Collections.sort(list);
            return list.get(list.size() - K);
      }
      
}
