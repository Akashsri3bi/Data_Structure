public class MinDistance {
      int minDist(int a[], int n, int x, int y) {
            // code here
            int ans = Integer.MAX_VALUE;
            int indx1 = -1;
            int indx2 = -1;
            for (int i = 0; i < n; i++) {
                  if (x == a[i]) {
                        indx1 = i + 1;
                  }
                  if (y == a[i]) {
                        indx2 = i + 1;
                  }
                  if (indx1 != -1 && indx2 != -1) {
                        ans = Math.min(ans, Math.abs(indx2 - indx1));
                  }
            }
            return ans == Integer.MAX_VALUE ? -1 : ans;
      }
      
}
