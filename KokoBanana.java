public class KokoBanana {

      public int minEatingSpeed(int[] piles, int h) {
            int low = 1;
            int max = Integer.MIN_VALUE;
            for (int pile : piles) {
                  max = Math.max(max, pile);
            }

            while (low < max) {
                  int mid = low + (max - low) / 2;
                  int hoursRequired = 0;

                  for (int pile : piles) {
                        hoursRequired += Math.ceil((double) pile / mid);
                  }

                  if (hoursRequired <= h) {
                        max = mid;

                  } else {
                        low = mid + 1;
                  }
            }

            return low;
      }
      
}
