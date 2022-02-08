
//Minimum Swaps required to bring all elements 
public class MinSwap {
      static int minSwap(int arr[], int n, int k) {
            int count = 0 ; 
            for(int i = 0 ; i < n ; i++){
                  if(arr[i]<=k){
                        count++ ; 
                  }
            }

            int bad = 0  ;
            for(int i = 0 ; i<count ; i++){
                  if(arr[i]>k){
                        bad++ ; 
                  }
            }

            int minSwap = bad ; 
            for(int i = 0 , j = count ; j<n  ; i++  , j++){
                  if(arr[i]>k){
                        bad--;
                  }
                  if(arr[j]>k){
                        bad++ ; 
                  }
                  minSwap = Math.min(minSwap, bad) ;
            }

            return minSwap ; 
      }
      public static void main(String[] args) {
            int arr[] = { 2, 1, 5, 6, 3 };
            int n = arr.length;
            int k = 3;
            System.out.print(minSwap(arr, n, k) + "\n");

            int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
            n = arr1.length;
            k = 5;
            System.out.print(minSwap(arr1, n, k));
      }
      
}
