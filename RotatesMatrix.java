public class RotatesMatrix {

      static int swap(int prev, int i, int j, int[][] arr) {
            int x = arr[i][j];
            arr[i][j] = prev;
            prev = x;
            return prev;
      }

      int[][] rotateMatrix(int m, int n, int arr[][]) {

            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = m - 1;

            while (left < right && top < bottom) {
                  int prev = arr[top + 1][left];

                  for (int i = left; i <= right; i++) {

                        prev = swap(prev, top, i, arr);
                  }
                  top++;

                  for (int i = top; i <= bottom; i++) {
                        prev = swap(prev, i, right, arr);
                  }
                  right--;

                  for (int i = right; i >= left; i--) {
                        prev = swap(prev, bottom, i, arr);
                  }
                  bottom--;

                  for (int i = bottom; i >= top; i--) {
                        prev = swap(prev, i, left, arr);
                  }
                  left++;

            }
            return arr;
      }
      
}
