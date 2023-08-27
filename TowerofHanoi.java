public class TowerofHanoi {

      public long toh(int N, int from, int to, int aux) {
            // Your code here
            if (N == 0) {
                  return 0;
            }
            long count = 0;
            count += toh(N - 1, from, aux, to);
            count += 1;
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            count += toh(N - 1, aux, to, from);
            return count;
      }
      
}
