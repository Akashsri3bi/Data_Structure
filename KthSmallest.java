import java.util.Arrays;

//Find the kth smallest element in the matrix 
public class KthSmallest {
      public static int kthSmallest(int[][] mat, int n, int k) {
            int[] arr = new int[n*n];
            int v = 0 ;
            for(int i = 0 ; i < n ; i++){
                  for(int j = 0  ; j < n ; j++){
                        arr[v] = mat[i][j] ;                        
                  }
            }

            Arrays.sort(arr);

            int res = arr[k-1] ; 
            return res ; 
      }
      public static void main(String[] args) {
            
      }
      
}
