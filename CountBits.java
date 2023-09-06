public class CountBits {

          static int findGreatestPowerOf2(int n){
        int x = 0 ; 
        while((1<<x)<=n){
            x++;
        }
        return x-1 ; 
    }
    static int countBits(int N){
        // code here
        if(N==0){
            return 0 ;
        }
        int x = findGreatestPowerOf2(N) ; 
        int k = x*(1<<(x-1)) ; 
        int c = (N - (1<<x) + 1);
        int next = (N-(1<<x)); 
        
        return k + c + countBits(next) ; 
    }
      
}
