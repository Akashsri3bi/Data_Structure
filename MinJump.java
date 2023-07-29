public class MinJump {

      static int minJumps(int[] arr) {
            int n = arr.length;
            int maxIndex = 0;
            int end = 0;
            int jumps = 0;

            for (int i = 0; i < n; i++) {
                  maxIndex = Math.max(maxIndex, i + arr[i]);
                  if (i == end) {
                        jumps++;
                        end = maxIndex;
                  }
                  if (end >= n - 1) {
                        return jumps;
                  }
            }

            return -1;

      }
      
}
