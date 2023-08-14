public class SearchInRow {

      static boolean search(int matrix[][], int n, int m, int x) {
            // code here
            int row = 0;
            int col = m - 1;

            while (row < n && col >= 0) {
                  if (matrix[row][col] == x) {
                        return true;
                  } else if (matrix[row][col] > x) {
                        col--;
                  } else {
                        row++;
                  }
            }

            return false;
      }
      
}
