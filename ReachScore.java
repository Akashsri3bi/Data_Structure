public class ReachScore {

      static int f(int i, int k, int[] arr) {
            if (i == 3) {
                  return 0;
            }
            if (k == 0) {
                  return 1;
            }
            int notTake = f(i + 1, k, arr);

            int take = 0;
            if (arr[i] <= k) {
                  take = f(i, k - arr[i], arr);
            }
            return take + notTake;

      }

      public long count(int n) {
            int[] arr = new int[] { 3, 5, 10 };
            return f(0, n, arr);
      }
      
}
