public class ArraySearchK {

      //Searching in an array where difference is atmost k between adjacent elements 
      //Here idea is to jump by diff/k steps in index to reach for our searched element

      static int search(int arr[], int n,
                            int x, int k){
            int i = 0 ;
            while(i<n){
                  if(arr[i]==x){
                        return i ; 
                  }

                  i = i + Math.max(1 , Math.abs((arr[i]-x)/k)) ;
            }

            return -1 ; 
      }
      public static void main(String[] args) {
            
      }
      
}
