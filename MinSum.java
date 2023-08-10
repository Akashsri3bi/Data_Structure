import java.util.Arrays;

public class MinSum {

          public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b) ; 
        
        int i = 0 ; 
        int j = b.length -1;
        long sum = 0 ;
        while(i<n && j>=0){
            sum+=a[i]*b[j] ; 
            i++;
            j-- ; 
        }
        return sum ; 
    }
      
}
