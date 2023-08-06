import java.util.Arrays;

public class MinimumPlatform {
          static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr); 
        Arrays.sort(dep) ; 
         
        int i = 0 , j = 0 , count = 0 , max = 0 ;
        while(i<n &&  j<n){
            if(arr[i]<=dep[j]){
                i++ ; 
                count++ ; 
                max = Math.max(max , count) ; 
            }else{
                j++ ; 
                count--;
            }
        }
        
        return max ; 
    }
      
}
