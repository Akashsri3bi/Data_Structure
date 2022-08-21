public class ProductArrayPuzzle {

      public static long[] productExceptSelf(int nums[], int n) {
            //for tommorow ;
            long[] storingarr = new long[n] ; 
            long mul = 1 ; 
            for(int i = 0 ; i < n ; i++) {
            if(nums[i]!=0){
                  mul*= nums[i];
            }else{
                  continue ;
            }
            }
            boolean flag = false ;  
            int a = -1 ;
            int count=0;
            for(int i = 0 ; i < n ; i++){
                  if(count>1){
                        flag = false ;  
                  }
                  if(nums[i]==0){
                        storingarr[i] = mul ; 
                        a = i ; 
                        flag = true ; 
                        count++;
                  }
            }
            for(int i = 0 ; i<n; i++){
                  if (count > 1) {
                        storingarr = new long[n];
                        return storingarr;
                  }else if(flag){
                        if(i==a){
                              continue ; 
                        }else{
                              storingarr[i] = 0 ;
                        }
                  } 
                  else{
                        storingarr[i] = mul / nums[i];
                  }
            }

            return storingarr ; 
      }

      public static void main(String[] args) {
            int nums[] = {85,0,0} ; 
            long[] arr = productExceptSelf(nums , nums.length) ;
            
            for(int i = 0 ; i < arr.length ; i++){
                  System.out.println(arr[i]);
            }
      }
      
}
