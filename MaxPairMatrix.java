//Find the maximum pair in matrix such that mat[c][d] - mat[a][b] is maximum 
//and c>a , d>b ; 
public class MaxPairMatrix {
      static int findMaxValue(int N,int mat[][]){
            int maxValue = Integer.MIN_VALUE ; 
            int[][] max_array = new int[N][N] ;
            max_array[N-1][N-1] = mat[N-1][N-1] ; 
            int maxV =   mat[N-1][N-1];
            //for preprocessing last row ; 
            for(int j = N-2 ; j>=0 ; j--){
                  if(mat[N-1][j]>maxV){
                        maxV = mat[N-1][j] ; 
                  }
                  max_array[N-1][j] = maxV ; 

            }

            maxV = mat[N - 1][N - 1];
            // for preprocessing last column of every row ;
            for (int i = N - 2; i >= 0; i--) {
                  if (mat[i][N-1] > maxV) {
                        maxV = mat[i][N-1];
                  }
                  max_array[i][N-1] = maxV;
            }

            //for Preprocessing the left over matrix ; 
            for(int i = N-2 ; i>=0 ; i--){
                  for(int j = N-2 ; j>=0  ; j--){
                        if(max_array[i+1][j+1]-mat[i][j]>maxValue){
                              maxValue = max_array[i+1][j+1]-mat[i][j] ; 
                        }
                        max_array[i][j] = Math.max(mat[i][j], Math.max(max_array[i+1][j], max_array[i][j+1]));
                  }
            }

            return maxValue ; 
      }
      public static void main(String[] args) {
            
            int N = 5;

            int mat[][] = {
                        { 1, 2, -1, -4, -20 },
                        { -8, -3, 4, 2, 1 },
                        { 3, 8, 6, 1, 3 },
                        { -4, -1, 1, 7, -6 },
                        { 0, -4, 10, -5, 1 }
            };

            System.out.print("Maximum Value is " +
                        findMaxValue(N, mat));
      }
      
}
