public class GameOfXOR {

      static int gameOfXor(int N, int[] A) {
            // code here
            int res = 0;
            for (int i = 0; i < N; i++) {
                  int countSubArrays = (i + 1) + (i + 1) * (N - (i + 1));
                  if (countSubArrays % 2 == 1) {
                        res = res ^ A[i];
                  }
            }
            return res;
      }
      
}
