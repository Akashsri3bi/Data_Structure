public class SmallestFactorial {

      boolean fact(int mid , int n ){
            int prod = 5 ; 
            int count = 0 ; 

            while(prod<=mid){
                  count+= (mid/prod) ; 
                  prod = prod*5 ; 
            }

            return count>=n ; 
      }

      int findNum(int n) {
            if(n==1){
                  return 5 ; 
            }

            int low = 0 ; 
            int high = 5*n ; 
            while(low<=high){
                  int mid = (low+high)/2 ; 
                  if(fact(mid , n)){
                        high = mid ; 
                  }else{
                        low = mid+1 ;
                  }
            }
            return low ; 
      }

      public static void main(String[] args) {
            
      }
      
}
