public class RotatedArraySearch {

      public int search(int[] nums, int target) {
            int l =  0 ;
            int u = nums.length-1 ;  
            while(l<=u){
                  if(nums[l]==target){
                        return l ; 
                  }else if(nums[u]==target){
                        return u ; 
                  } 
                  l++ ; 
                  u-- ; 
            }

            return -1 ;

            
      }
      
}
