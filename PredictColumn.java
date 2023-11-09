public class PredictColumn {

      int columnWithMaxZeros(int arr[][], int N) {
            // code here
            int max = 0;
            int col = -1;
            for (int i = 0; i < N; i++) {
                  int count = 0;
                  for (int j = 0; j < N; j++) {
                        if (arr[j][i] == 0) {
                              count++;
                        }
                  }
                  if (count > 0 && count > max) {
                        max = count;
                        col = i;
                  }
            }
            return col;
      }
}
