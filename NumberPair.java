import java.util.Arrays;

public class NumberPair {

          static int firstElementGreaterThan(int[] y , int n , int target){
        int low = 0 ;
        int high = n-1; 
        int index = -1 ;
        while(low<=high){
            int mid = low + (high-low)/2 ; 
            if(y[mid]>target){
                index = mid ; 
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        
        return index ; 
    }
    static long countPairs(int x[], int y[], int M, int N)
    {
        // your code here
        Arrays.sort(x) ; 
        Arrays.sort(y) ; 
        
        long zero = 0 ;
        long one = 0 ; 
        long two= 0;
        long three = 0 ;
        long four = 0 ;
        
        for(int i = 0 ;i<N;i++){
            if(y[i]==0){
                zero++;
            }
            else if(y[i]==1){
                one++;
            }
            else if(y[i]==3){
                three++;
            }
            else if(y[i]==2){
                two++;
            }
            else if(y[i]==4){
                four++;
            }
        }
        
        long ans = 0 ;
        for(int i = 0 ; i<M;i++){
            if(x[i]==0){
                continue ; 
            }else if(x[i]==1){
                ans+=zero ; 
            }else if(x[i]==2){
                int index = firstElementGreaterThan(y,N,2);
                
                if(index!=-1){
                    ans+= (N-index) ; 
                }
                
                ans-=three ; 
                ans-=four ; 
                ans+=one+zero ;
            }else{
                int index = firstElementGreaterThan(y,N,x[i]);
                if(index!=-1){
                    ans+= (N-index) ; 
                }
                ans+=one + zero ; 
                
                if(x[i]==3){
                    ans+=two;
                }
            }
        }
        
        return ans ; 
        
    }
      
}
