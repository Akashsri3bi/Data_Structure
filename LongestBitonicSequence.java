import java.util.Arrays;

public class LongestBitonicSequence {

          public static int longestBitonicSequence(int[] arr, int n) {
        // Write your code here.
        int[] dp1 = new int[n] ; 
        Arrays.fill(dp1,1) ;
        for(int i = 0 ;i<n;i++){
            for(int prev = 0;prev<i;prev++){
                if(arr[prev]<arr[i] && 1 + dp1[prev]>dp1[i]){
                    dp1[i] = 1 + dp1[prev] ; 
                }
            }
        }

        int[] dp2 = new int[n] ; 
        Arrays.fill(dp2,1) ;
        for(int i = n-1 ;i>=0;i--){
            for(int prev = n-1;prev>i;prev--){
                if(arr[prev]<arr[i] && 1 + dp2[prev]>dp2[i]){
                    dp2[i] = 1 + dp2[prev] ; 
                }
            }
        }
        int maxi = 0 ;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,dp1[i]+dp2[i] - 1 ) ; 
        }
        return maxi ; 
    }
      
}
