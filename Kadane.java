//KADANE'S ALGO for maxSubArray Sum .
public class Kadane {
      static int maxSubArray(int[] arr , int n){
            int maxSum = Integer.MIN_VALUE , currentSum = 0; 
            for(int i = 0 ; i < n ; i++){
                  currentSum+=arr[i] ;  
                  if(currentSum>maxSum){
                        maxSum = currentSum ; 
                  }
                  if(currentSum<0){
                        currentSum = 0 ; 
                  }
            }
            return maxSum ;
      }
      public static void main(String[] args) {
            int arr[] = { -1, -2, -3, -4 };
            int maxSubArraySum = maxSubArray(arr, arr.length);
            System.out.println(maxSubArraySum); 
      }
      
}
