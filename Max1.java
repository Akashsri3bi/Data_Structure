public class Max1 {
      int rowWithMax1s(int arr[][], int n, int m) {
            int ans = -1 ; 
            int s = 0 ; 
            for(int i = 0 ; i < n ; i++){
                  int count = 0 ; 
                  for(int j = 0 ; j < m ; j++){
                        if(arr[i][j]==1){
                              count++ ; 
                        }
                  }
                  if(count>s){
                        s = count ; 
                        ans = i ;
                  }
            }
            return ans ; 
      }
      public static void main(String[] args) {
            
      }
      
}
