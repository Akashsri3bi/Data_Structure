public class MinPage {

      static boolean isfeasible(int[] arr , int k , int res){
            int student = 0  ; 
            int sum = 0 ; 
            for(int i = 0 ; i < arr.length ; i++){
                  if(sum+arr[i]>res){
                        student++ ; 
                        sum = arr[i] ; 
                  }else{
                        sum+=arr[i] ; 
                  }
            }

            return student<=k ; 
      }

      public static int findPages(int[] A, int N, int M) {
            int res = 0 ; 
            int min = A[N-1] ; 

            int max = 0 ; 
            for(int i = 0  ; i < N ; i++){
                  max+=A[i] ; 
            }

            while(min<=max){
                  int mid = (min+max)/2 ; 

                  if(isfeasible(A , M , mid)){
                        res = mid ; 
                        max = mid-1 ; 
                  }else{
                        min = mid+1 ; 
                  } 
            }

            return res;
      }

      public static void main(String[] args) {
            
      }
      
}
