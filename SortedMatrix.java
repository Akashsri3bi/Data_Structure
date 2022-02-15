//Print elements in a sorted order in a row wise sorted matrix 
public class SortedMatrix {
      //If rows are sorted 
      int[][] sortedMatrix(int N, int Mat[][]) {
            
            for(int i = 0 ; i < N-1 ; i++){
                  for(int j = 0 ; j<N ; j++){
                        for(int k = i+1 ; k<N ; k++){
                              for(int l = 0 ; l<N ; l++){
                                    if(Mat[i][j]>Mat[k][l]){
                                          int temp = Mat[i][j] ;
                                          Mat[i][j] = Mat[k][l] ;
                                          Mat[k][l] = temp ; 
                                    }
                              }
                        }
                  }
            }

            for(int i = 0 ; i<Mat[0].length ; i++){
                  if(Mat[N-1][i]>Mat[N-1][i+1]){
                        int temp = Mat[N-1][i] ; 
                        Mat[N-1][i] = Mat[N-1][i+1] ; 
                        Mat[N-1][i+1] = temp ; 
                  }
            }
            
            return Mat ; 
      }
      public static void main(String[] args) {
            
      }
      
}
