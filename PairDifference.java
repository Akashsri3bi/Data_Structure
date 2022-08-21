public class PairDifference {

      public boolean findPair(int arr[], int size, int n) {
            for (int i = 0; i < size-1; i++) {
                  int j = i+1;
                  while (j < size) {
                        if(Math.abs(arr[i] - arr[j])==n){
                              return true ; 
                        }
                        j++ ; 
                  }
            }

            return false ;
      }

      public static void main(String[] args) {
            
      }
      
}
