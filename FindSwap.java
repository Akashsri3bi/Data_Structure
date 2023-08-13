import java.util.Arrays;

public class FindSwap {

          long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        Arrays.sort(A) ; 
        Arrays.sort(B) ; 
        long sum1 = 0 ;
        long sum2 = 0 ;
        
        for(int i = 0 ;i<n;i++){
            sum1+=A[i] ; 
        }
        
        for(int i = 0 ;i<m;i++){
            sum2+=B[i] ;
        }
        
        int k = 0,j=0;
         while(k<n&&j<m){
            long temp_sum1=sum1,temp_sum2=sum2;
            temp_sum1=temp_sum1-A[k]+B[j];
            temp_sum2=temp_sum2-B[j]+A[k];
            if(temp_sum1==temp_sum2) return 1;
            else if(temp_sum1>temp_sum2) k++;
            else j++;
        }
        
        return -1 ;
        
    }
      
}
