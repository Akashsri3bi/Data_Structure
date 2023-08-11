public class LIS {
      static int longestSubsequence(int n, int arr[]) {
            int tail[] = new int[n];
            int len = 0;
            for (int i = 0; i < n; i++) {
                  int idx = binarySearch(tail, 0, len - 1, arr[i]);
                  tail[idx] = arr[i];
                  if (idx == len) {
                        len++;
                  }
            }
            return len;
      }

      static int binarySearch(int tail[], int l, int r, int x) {
            while (r >= l) {
                  int m = l + (r - l) / 2;
                  if (tail[m] == x) {
                        return m;
                  } else if (tail[m] < x) {
                        l = m + 1;
                  } else {
                        r = m - 1;
                  }
            }
            return l;
      }
      
}
