public class Insert {
      //Search insert position 
      public static int searchInsert(int[] nums, int target) {
            int lb = 0 , ub = nums.length-1 ;
            int mid = 1 ;
            while(lb<=ub){
                  mid = lb + (ub-lb)/2;
                  if(target==nums[mid]){
                        return mid ; 
                  }else if(target>nums[mid]){
                        lb = mid+1 ; 
                  }else{
                        ub = mid-1 ; 
                  }
            }
            return nums[mid] > target ? mid : mid + 1;
      }
      public static void main(String[] args) {
            int[] nums = {1,3,5,6};
            System.out.println(searchInsert(nums, 9));
      }
      
}
