public class LongestConsecutive1 {

      public static int maxConsecutiveOnes(int n) {

            // Your code here
            int maxLen = 0;
            int len = 0;
            while (n > 0) {
                  if ((n & (1)) != 1) {
                        maxLen = Math.max(maxLen, len);
                        len = 0;
                        n = n >> 1;
                  } else {
                        n = n >> 1;
                        len++;

                  }
            }
            maxLen = Math.max(maxLen, len);
            return maxLen;
      }
      
}
