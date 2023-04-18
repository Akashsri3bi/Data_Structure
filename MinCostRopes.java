import java.util.PriorityQueue;

public class MinCostRopes {

      long minCost(long arr[], int n) {
            // your code here
            PriorityQueue<Long> pq = new PriorityQueue<>();
            long sum = 0, cost = 0;
            for (int i = 0; i < arr.length; i++) {
                  pq.add(arr[i]);
            }
            while (pq.size() > 1) {
                  for (int i = 0; i < 2; i++) {
                        sum += pq.poll();
                  }
                  pq.add(sum);
                  cost += sum;
                  sum = 0;
            }

            return cost;
      }
      
}
