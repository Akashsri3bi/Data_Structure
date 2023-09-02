import java.util.ArrayList;

public class ArrayToBST {

          static void f( ArrayList<Integer> list , int[] nums , int low , int high){
        if(low>high){
            return  ; 
        }
        
        int mid = low + (high-low)/2 ; 
        list.add(nums[mid]) ; 
        
        f(list , nums , low , mid-1) ; 
        f(list , nums , mid+1,high) ; 
    }
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int low = 0 ; 
        int high = nums.length - 1; 
        ArrayList<Integer> list = new ArrayList<>() ; 
        
        f(list , nums , low , high) ; 
        
        int[] ans = new int[list.size()] ;
        for(int i = 0 ;i<list.size() ; i++){
            ans[i] = list.get(i) ; 
        }
        
        return ans ;
    }
      
}
