import java.util.Arrays;

public class MedianMatrix {
      int median(int matrix[][], int r, int c) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < matrix.length ; i++){
                  min = Math.min(matrix[i][0], min);
                  max = Math.max(matrix[i][c-1], max) ;
            }
            int median_index = (r*c+1)/2 ; 
            int total_count = 0 ; 
            while(min<max){
                  int mid = min + (max-min)/2 ; 
                  for(int i = 0 ; i < matrix.length ; i++){
                        int index = Arrays.binarySearch(matrix[i], mid) ; 
                        if(index<0){
                              index = Math.abs(index)-1 ; 
                        }else{
                              while(index<matrix[i].length && matrix[i][index]==mid){
                                    index++ ; 
                              }
                        }
                        total_count += index;
                  }
                  if(total_count<median_index){
                        min = mid+1 ; 
                  }else{
                        max = mid; 
                  }
            }
            return min;
      }
      public static void main(String[] args) {
            
      }
      
}
