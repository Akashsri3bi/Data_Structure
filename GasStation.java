public class GasStation {

      public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int sum_gas = 0;
            int sum_cost = 0;
            for (int i = 0; i < n; i++) {
                  sum_gas += gas[i];
                  sum_cost += cost[i];
            }
            if (sum_gas < sum_cost) {
                  return -1;
            }

            int tot = 0;
            int start = 0;
            for (int i = 0; i < n; i++) {
                  tot += (gas[i] - cost[i]);
                  if (tot < 0) {
                        tot = 0;
                        start = i + 1;
                  }
            }
            return start;
      }
      
}
