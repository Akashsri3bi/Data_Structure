import java.util.Arrays;

public class Maximizesum {

          public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here   
        Arrays.sort(a) ;
        int j = 0 ;
        for(int i = 0 ;i<n &&  i<k ; i++){
            if(a[i]<0){
                a[i] = -a[i] ;
                j++;
            }
        }
        
        Arrays.sort(a) ;
        while(j<k){
            a[0] = -a[0] ;
            j++ ;
        }
        
        long ans = 0 ; 
        for(int i = 0 ; i<n ;  i++){
            ans+= a[i] ;
        }
        return ans ;
    }
      
}
