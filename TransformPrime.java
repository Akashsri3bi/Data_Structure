public class TransformPrime {

          static boolean isPrime(int n){
        if(n==1){
            return false ;
        }
        if(n>1 && (n==2||n==3)){
            return true ; 
        }
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true ; 
    }
    public int minNumber(int arr[], int N)
    {
        int sum = 0 ;
        for(int i = 0;i<N;i++){
            sum+=arr[i] ; 
        }
        if(isPrime(sum)){
            return 0 ; 
        }
        int count = 0 ;
        while(!isPrime(sum)){
            sum++;
            count++;
        }
        return count ; 
    }
      
}
