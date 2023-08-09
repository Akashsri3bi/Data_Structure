public class EquiPoint {

      public static int equilibriumPoint(long arr[], int n) {

            // Your code here
            long total = 0;
            for (int i = 0; i < n; i++) {
                  total += arr[i];
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                  sum += arr[i];
                  if (sum == total) {
                        return i + 1;
                  }
                  total = total - arr[i];
            }
            return -1;
      }
      
}
