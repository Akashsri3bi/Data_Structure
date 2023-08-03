import java.util.Arrays;

public class MaxSumRectangle {

          static int kadane(int[] sum){
        int maxSum = Integer.MIN_VALUE ; 
        int sums = 0 ;
        for(int i = 0 ;i<sum.length ; i++){
            sums+=sum[i] ; 
            maxSum = Math.max(maxSum , sums) ; 
            if(sums<0){
                sums = 0 ;
            }
        }
        
        return maxSum ; 
    }
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int maxSum = Integer.MIN_VALUE ;
        int[] sum = new int[R] ;
        for(int col = 0 ; col<C ; col++){
            Arrays.fill(sum,0) ;
            //Whenever change of column which tells us we are calculating for 
            //new column 
            for(int colEnd = col ; colEnd<C ; colEnd++){
                for(int row = 0 ; row < R ; row++){
                    sum[row]+= M[row][colEnd] ; 
                }
                int currSum = kadane(sum) ; 
                maxSum = Math.max(currSum , maxSum) ; 
            }
        }
        
        return maxSum ; 
    }
      
}
