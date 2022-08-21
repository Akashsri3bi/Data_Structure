import java.util.Arrays;

public class JobScheduling {

      public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            int[][] arr = new int[startTime.length][3];

            for(int i = 0 ; i < arr.length ; i++){
                  arr[i][0] = startTime[i];
                  arr[i][1] = endTime[i];
                  arr[i][2] = profit[i] ;   
            }

            Arrays.sort(arr , (n1,n2)-> n1[1]-n2[1]); //Normally Arrays.sort sorts with first value this sorts the array by picking the second element
            int[] dp = new int[startTime.length] ; 
            dp[0] = arr[0][2] ; //Profit here -->
            for(int i = 1 ; i < arr.length ; i++){
                  int inc = arr[i][2] ; 
                  int last = -1 ; 
                  int low = 0 ;
                  int high = i-1 ; 
                  while(low<=high){
                        int mid = (low+high)/2 ; 
                        if(arr[mid][1]<=arr[i][0]){
                              last = mid ; 
                              low = mid + 1 ; 
                        }else{
                              high = mid -1 ;
                        }
                  }

                  if (last != -1)
                        inc += dp[last];

                  int exc = dp[i - 1];

                  dp[i] = Math.max(inc, exc);
            }

            return dp[arr.length-1]  ;

      }

      public static void main(String[] args) {
            
      }
      
}
