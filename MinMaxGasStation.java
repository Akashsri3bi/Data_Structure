public class MinMaxGasStation {
      static int countGasStation(int[] arr, double mid) {
            int cnt = 0;
            for (int i = 1; i < arr.length; i++) {
                  double numberInBtw = Math.ceil((arr[i] - arr[i - 1]) / mid);
                  cnt += numberInBtw - 1;
            }
            return cnt;
      }

      public static double MinimiseMaxDistance(int[] arr, int K) {
            // Write your code here.
            double low = 0;
            double high = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                  high = Math.max(high, arr[i + 1] - arr[i]);
            }
            double diff = 1e-6;
            while (high - low > diff) {
                  double mid = low + (high - low) / 2.0;
                  int count = countGasStation(arr, mid);
                  if (count > K)
                        low = mid;
                  else
                        high = mid;
            }

            return high;
      }
      
}
