public class SearchMatrix {
      public boolean searchMatrix(int[][] matrix, int target) {
            int r = 0, c = matrix[0].length - 1;

            // start checking from end of the row
            while (r < matrix.length && c >= 0) {
                  if (matrix[r][c] == target)
                        return true;

                  // if current num is greater than target we will search
                  // it in previous columns on the left of the current traversing number
                  else if (matrix[r][c] > target)
                        c--;

                  // else if target is greater than current num we will search
                  // further in next row
                  else
                        r++;
            }
            return false;
      }

      public static void main(String[] args) {
            int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ; 
            int target = 3 ; 
            //System.out.println(searchMatrix(matrix, target));
      }
      
}
