public class MidSum {

      int findMidSum(int[] ar1, int[] ar2, int n) {
            // code here
            if (n == 1) {
                  return ar1[0] + ar2[0];
            } else if (n < 1) {
                  return 0;
            }
            int ind = 0;
            int sum = 0;
            int p1 = 0;
            int p2 = 0;
            while (p1 < n && p2 < n) {
                  if (ar1[p1] < ar2[p2]) {
                        if (ind == n - 1 || ind == n) {
                              sum += ar1[p1];
                        }
                        p1 += 1;
                        ind += 1;
                  } else {
                        if (ind == n - 1 || ind == n) {
                              sum += ar2[p2];
                        }
                        p2 += 1;
                        ind += 1;
                  }
            }
            while (p1 < n) {
                  if (ind == n) {
                        sum += ar1[p1];
                        ind += 1;
                        break;
                  }
                  p1 += 1;
            }
            while (p2 < n) {
                  if (ind == n) {
                        sum += ar2[p2];
                        ind += 1;
                        break;
                  }
                  p2 += 1;
            }
            return sum;
      }
      
}
