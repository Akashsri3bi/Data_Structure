import java.util.Arrays;

public class ProductOfArraySelf {

          public int[] productExceptSelf(int[] nums) {
        int n = nums.length ; 
        int[] ans = new int[n] ; 
        Arrays.fill(ans , 1) ; 
        int curr = 1 ;
        //Left part ; 
        for(int i = 0 ;i<n; i++){
            curr = curr*nums[i] ; 
            ans[i] = curr ; 
        }
        curr = 1;
        for(int i = n-1 ;i>0;--i){
            ans[i] = ans[i-1]*curr;
            curr = curr*nums[i] ; 
        }
        ans[0] = curr;
        return ans ;
    }
      
}
