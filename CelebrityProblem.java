public class CelebrityProblem {

      int celebrity(int M[][], int n) {
            // code here
            int[] in = new int[n];
            int[] out = new int[n];

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        if (M[i][j] == 1) {
                              in[j]++;
                              out[i]++;
                        }
                  }
            }
            for (int i = 0; i < n; i++) {
                  if (in[i] == n - 1 && out[i] == 0) {
                        return i;
                  }
            }
            return -1;
      }
      
}
