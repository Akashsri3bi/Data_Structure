//Program to find largest sum contigous SubArray @Kadanes Algo [V.IMP]
//Meaning of this question is to find the subArray from the Array which has the largest sum and its value
public class subArray {

      //Kadane's Solution O(n)
      static int maxSumSubArray(int a[] , int n){
            int maxSum = 0 ; 
            int curSum = 0; 
            for(int i = 0 ; i < n ; i++){
                  curSum+=a[i];
                  if(curSum > maxSum){
                        maxSum = curSum; 
                  
                  //If the subArray Sum becomes negative we discard that array and start new thats kadanes
                  }else if(curSum < 0){
                        curSum = 0 ; 
                  }
            }
            return maxSum ; 
      }



      static int TimeComplexedArray(int[] arr , int n){ //O(n^2)
            int maxSum = 0 ;
            for(int i = 0 ; i < n ; i++){
                  int sum = 0 ; 
                  for(int j = i ; j<n ; j++){
                        sum = sumCalc(arr, i, j);
                        if(sum>maxSum){
                              maxSum = sum ; 
                        }
                  }
            }
            return maxSum ;

      }

      static int sumCalc(int[] arr , int start , int end){
            int sum = 0 ; 
            while(start<=end){
                  sum+=arr[start] ;
                  start++ ; 
            }
            return sum ;
      }

      public static void main(String[] args) {
            int arr1[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
            int max = maxSumSubArray(arr1, arr1.length);
            System.out.print(max);

      }
      
}
