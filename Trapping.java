//Trapping Rain water problem 
public class Trapping {

      static long trappingWater(int arr[], int n) {
            int[] left = new int[n];  
            int[] right = new int[n] ;
            left[0] = arr[0] ; 
            for(int i = 1 ; i < n ; i++){
                  left[i] = Math.max(left[i-1], arr[i]);
            }

            right[n-1] = arr[n-1] ; 
            for(int j = n-2 ; j>=0 ; j--){
                  right[j] = Math.max(right[j+1],arr[j]);
            }

            int ans = 0 ; 
            for(int i = 0 ; i < n ; i++){
                  ans+= Math.min(left[i], right[i]) - arr[i] ;
            }

            return ans ; 

      }

      public static void main(String[] args) {
            int arr[] = {3,0,0,2,0,4} ; 
            System.out.println(trappingWater(arr, arr.length));
      }
      
}
