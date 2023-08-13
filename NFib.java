public class NFib {

          static int nthFibonacci(int n){
        // code here
        int[] store = new int[n+1] ;
        store[0] = 0 ; 
        store[1]= 1; 
        int mod = 1000000007 ; 
        
        for(int i = 2 ; i<=n ; i++){
            store[i] = (store[i-1]%mod + store[i-2]%mod)%mod ; 
        }
        
        return store[n] ; 
    }
      
}
